data class Course(
    private var title: String,
    private var noOfTeachers: Int,
    private var courseRep: String,
    private var noOfEnrolledStudents: Int,
    private var headTeacher: String

) {
    fun setCourseTitle(title: String){
        this.title = title
    }

    fun noOfTeachers(noOfTeachers: Int){
        this.noOfTeachers = noOfTeachers
    }

    fun setCourseRep(courseRep: String){
        this.courseRep = courseRep
    }

    fun setNoOfEnrolledStudents(noOfEnrolledStudents: Int){
        this.noOfEnrolledStudents = noOfEnrolledStudents
    }

    fun setHeadTeacher(headTeacher: String){
        this.headTeacher = headTeacher
    }

    fun getCourseInfo(): String{
        return """
            Course Title:                    $title
            Head Teacher:                   $headTeacher
            Number of Teachers:             $noOfTeachers
            Number of Students Enrolled:    $noOfEnrolledStudents
            Course Rep:                     $courseRep
        """.trimIndent()
    }

    fun setCourse(title: String,noOfTeachers: Int,courseRep: String,noOfEnrolledStudents: Int,headTeacher: String){
        this.title = title
        this.noOfTeachers = noOfTeachers
        this.courseRep = courseRep
        this.headTeacher = headTeacher
        this.noOfEnrolledStudents = noOfEnrolledStudents
    }


}