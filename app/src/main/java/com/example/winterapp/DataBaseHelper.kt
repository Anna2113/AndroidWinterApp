package com.example.winterapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper (
    context: Context,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    companion object {
        val DATABASE_VERSION = 1
        val DATABASE_NAME = "users.db"
        val TABLE_USERS = "users"

        val COLUMN_ID = "id"
        val COLUMN_USER_NAME = "user_name"
        val COLUMN_USER_SURNAME = "user_surname"
        val COLUMN_USER_AGE = "user_age"
        val COLUMN_USER_GENDER= "user_gender"
        val COLUMN_USER_HEIGHT = "user_height"
        val COLUMN_USER_WEIGHT = "user_weight"
        val COLUMN_USER_FOOT = "user_foot"
        val COLUMN_USER_SPORT = "user_sport"
        val COLUMN_USER_LEVEL = "user_level"
        val COLUMN_USER_TYPE = "user_type"
    }

    override fun onCreate(dataBase: SQLiteDatabase?) {
        val CREATE_USERS_TABLE =("CREATE TABLE " +
                TABLE_USERS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_USER_NAME + " TEXT,"
                + COLUMN_USER_SURNAME + " TEXT,"
                + COLUMN_USER_AGE + " INT,"
                + COLUMN_USER_GENDER + " TEXT,"
                + COLUMN_USER_HEIGHT + " DOUBLE,"
                + COLUMN_USER_WEIGHT + " DOUBLE,"
                + COLUMN_USER_FOOT + " DOUBLE,"
                + COLUMN_USER_SPORT + " TEXT,"
                + COLUMN_USER_LEVEL + " TEXT,"
                + COLUMN_USER_TYPE + " TEXT" + ")"
                )
        dataBase?.execSQL(CREATE_USERS_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        p0?.execSQL("DROP TABLE IF EXISTS" + TABLE_USERS)
        onCreate(p0)
    }

    fun addUser(user: User){
        val values = ContentValues()
        values.put(COLUMN_USER_NAME, user.name)
        values.put(COLUMN_USER_SURNAME, user.surname)
        values.put(COLUMN_USER_AGE, user.age)
        values.put(COLUMN_USER_GENDER, user.gender)
        values.put(COLUMN_USER_HEIGHT, user.height)
        values.put(COLUMN_USER_WEIGHT, user.weight)
        values.put(COLUMN_USER_FOOT, user.foot)
        values.put(COLUMN_USER_SPORT, user.sport)
        values.put(COLUMN_USER_LEVEL, user.level)
        values.put(COLUMN_USER_TYPE, user.type)

        val db = this.writableDatabase
        db.insert(TABLE_USERS, null, values)
        db.close()
    }

    fun findUser(userName: String, userSurname: String, userAge: Int): User?{
        val query =
            "SELECT * FROM $TABLE_USERS WHERE $COLUMN_USER_NAME = \"$userName\"" +
                    "and $COLUMN_USER_SURNAME = \"$userSurname\"" +
                    "and $COLUMN_USER_AGE = \"$userAge\""

        val db = this.writableDatabase
        val cursor = db.rawQuery(query, null)
        var user: User? = null

        if(cursor.moveToFirst()){
            cursor.moveToFirst()

            val id = cursor.getString(0).toInt()
            val imie = cursor.getString(1)
            val nazwisko = cursor.getString(2)
            val wiek = cursor.getString(3).toInt()
            val plec = cursor.getString(4)
            val wzrost = cursor.getString(5).toDouble()
            val waga = cursor.getString(6).toDouble()
            val dlugoscStopy = cursor.getString(7).toDouble()
            val sport = cursor.getString(8)
            val poziom = cursor.getString(9)
            val rodzajJazdy = cursor.getString(10)

            user = User(id, imie, nazwisko, wiek, plec, wzrost, waga, dlugoscStopy, sport, poziom, rodzajJazdy)
            cursor.close()
        }
        db.close()
        return user
    }

    fun deleteUser(userName: String, userSurname: String, userAge: Int): Boolean{
        var result = false

        val query =
            "SELECT * FROM $TABLE_USERS WHERE $COLUMN_USER_NAME = \"$userName\"" +
                    "and $COLUMN_USER_SURNAME = \"$userSurname\"" +
                    "and $COLUMN_USER_AGE = \"$userAge\""

        val db = this.writableDatabase

        val cursor = db.rawQuery(query, null)

        if(cursor.moveToFirst()){
            val id = Integer.parseInt(cursor.getString(0))
            db.delete(TABLE_USERS, COLUMN_ID + " = ?",
            arrayOf(id.toString()))
            cursor.close()
            result = true
        }
        db.close()
        return result
    }

}

