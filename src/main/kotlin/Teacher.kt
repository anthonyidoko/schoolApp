class Teacher(firstName: String, lastName: String, age: Int, salary: Int, yearsOfExperience: Int, unit: String,
    staffId:String,
    address: Address
):Staff(firstName, lastName,age,salary,yearsOfExperience,unit,staffId),Duty {

    override fun canDo(): String {
        return "Can teach a course"
    }

}