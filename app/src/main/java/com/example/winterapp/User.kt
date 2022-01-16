package com.example.winterapp

class User {
    var id: Int = 0
    var name: String = ""
    var surname: String = ""
    var age: Int = 0
    var gender: String = ""
    var height: Double = 0.0
    var weight: Double = 0.0
    var foot: Double = 0.0
    var sport: String = ""
    var level: String = ""
    var type: String = ""

    constructor(name: String, surname: String, age: Int, gender: String, height: Double,
                weight: Double, foot: Double, sport: String, level: String, type: String
    ) {
        this.name = name
        this.surname = surname
        this.age = age
        this.gender = gender
        this.height = height
        this.weight = weight
        this.foot = foot
        this.sport = sport
        this.level = level
        this.type = type
    }

    constructor(id: Int, name: String, surname: String, age: Int, gender: String, height: Double,
                weight: Double, foot: Double,sport: String, level: String, type: String
    ) {
        this.id = id
        this.name = name
        this.surname = surname
        this.age = age
        this.gender = gender
        this.height = height
        this.weight = weight
        this.foot = foot
        this.sport = sport
        this.level = level
        this.type = type
    }

    constructor()


}

