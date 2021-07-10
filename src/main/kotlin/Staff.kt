abstract class Staff(
    private var firstName: String,
    private var lastName:String,
    private var age: Int,
    private var salary: Int,
    private var yearsOfExperience: Int,
    private var unit: String,
    private var staffId: String
) {

    fun getFullName():String{
        return "$firstName $lastName"
    }

    fun getFirstName(): String{
        return firstName
    }

    fun getLastName(): String{
        return lastName
    }

    fun getAge(): Int{
        return age
    }

    fun getSalary(): String{
        return "$$salary"
    }

    fun getYearsOfExperience(): Int{
        return yearsOfExperience
    }

    fun getUnit(): String{
        return unit
    }

    fun getStaffId(): String{
        return staffId
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun setAge(age: Int){
        this.age = age
    }

    fun setSalary(salary: Int){
        this.salary = salary
    }

    fun setYearsOfExperience(yearsOfExperience: Int) {
        this.yearsOfExperience = yearsOfExperience
    }

    fun getUnit(unit: String){
        this.unit = unit
    }

    fun getStaffId(staffId: String) {
        this.staffId = staffId
    }

    fun employeeDetail(): String{
        return """
            Full Name:              ${getFullName()}
            Age:                    ${getAge()}
            Salary:                 ${getSalary()}
            Years of Experience:    ${getYearsOfExperience()}
            Unit:                   ${getUnit()}
            Staff Identity:         ${getStaffId()}
        """.trimIndent()
    }
}