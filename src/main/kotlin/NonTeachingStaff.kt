class NonTeachingStaff(firstName: String, lastName: String, age: Int, salary: Int, yearsOfExperience: Int, unit: String,
                       staffId:String,
                       address: Address
):Staff(firstName, lastName,age,salary,yearsOfExperience,unit,staffId),Duty {

    override fun canDo(): String {
        return "Whatever task assigned from the ${getUnit()} department"
    }

}