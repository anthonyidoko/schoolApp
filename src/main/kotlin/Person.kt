open class Person(private var firstName: String,
                  private var lastName: String,
                  private var age: Int) {

    open fun getPerson(): String{
        return """
            Full Name:              $firstName $lastName
            age:                    $age
        """.trimIndent()
    }

    open fun getFirstName():String{
        return firstName
    }

    open fun getLastName():String{
        return lastName
    }

    open fun getAge():Int{
        return age
    }

    open fun getFullName(): String{
        return "$firstName $lastName"
    }
}