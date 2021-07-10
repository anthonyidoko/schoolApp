class Student(firstName: String, lastName: String,
    private var studentId: String = "NT${(1000 until 2000).random()}",
    age: Int,
    address: Address,
    private var courses: ArrayList<String>
):
    Person(firstName, lastName,age),Duty {

    override fun canDo(): String {
        return "Can take a course"
    }

    fun addToCourse(course:String){
        courses.add(course)
    }

    fun getStudentId(): String{
        return studentId
    }


    fun getCourses(): ArrayList<String>{
        return this.courses
    }

    fun getStudentDetail() : String{
        return """
            Full Name:          ${getFullName()}
            Student Identity:   $studentId
            Courses:            ${getCourses()}
        """.trimIndent()
    }

}