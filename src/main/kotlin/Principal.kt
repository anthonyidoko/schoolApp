class Principal(firstName: String, lastName: String, age: Int, salary: Int, yearsOfExperience: Int, unit: String="School Head",
                staffId:String,
                address: Address
):Staff(firstName, lastName,age,salary,yearsOfExperience,unit,staffId),Duty {

    override fun canDo(): String {
        return "${getFullName()} can expel a student"
    }

    fun canDo(age: Int): String{
        if (age > 17 ){
            return  "Mr ${getFullName()} can admit applicant"
        }
        return "Mr ${getFullName()} will not admit this applicant"
    }


}