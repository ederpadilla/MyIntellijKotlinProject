/**
 * Created by ederpadilla on 06/06/17.
 */
class User {

    var name: String?=null
    var id: String?=null
    var age: Int = 0

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, id: String) {
        this.name = name
        this.id = id
    }

    constructor(id: String, age: Int) {
        this.id = id
        this.age = age
    }

    constructor() {}

    override fun toString(): String {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}'
    }
}

