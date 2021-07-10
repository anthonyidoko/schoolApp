import java.util.*
import kotlin.collections.ArrayList

var principalHolder : Principal? = null
var listOfStudents = arrayListOf<Student>()
var listOfSelectedApplicants = arrayListOf<Applicant>()
var lisOfApplicants = arrayListOf<Applicant>()
var listOfTeachers = arrayListOf<Teacher>()
var listOfNonTeachingStaff = arrayListOf<NonTeachingStaff>()
var teacherHolder : Teacher? = null


fun Principal.addNewApplicant(listOfApplicants:ArrayList<Applicant>) {
    for (applicant in listOfApplicants){
        if (applicant.getAge() >= 21){
            println(""""
                Dear ${applicant.getFullName()}
                You have been offered admission to Anthony Model School.
                fill the student details below
                """.trimMargin())
            createNewStudent()

        }
    }
}

fun welcomeMessage(){
    println("Kindly select your category or 'q' to quit")
    println("1. Principal")
    println("2. Staff")
    println("3. Student")
    println("4. Applicant")

    print(">  ")
}

fun navigateSchool(){
    welcomeMessage()
    var input = Scanner(System.`in`)
    var choice:String? = readLine()

    while (choice != "q"){
        var input = Scanner(System.`in`)
        if (choice == "1"){
            if (principalHolder == null){
                println("sign up as principal")
                println("Enter your country here")
                print(">  ")
                var country:String = readLine().toString()
                println("Enter your state here")
                print(">  ")
                var state = readLine().toString()
                println("Enter your city here")
                print(">  ")
                var city = readLine().toString()
                println("What is the name of your street?")
                print(">  ")
                var street = readLine().toString()
                println("What is your house number?")
                print(">  ")
                var houseNumber:Int = input.nextInt()
                var principalAddress = Address(
                    country=country,state = state,city = city,
                    streetName = street,houseNumber=houseNumber)

                println("Enter your first name")
                print(">  ")
                var firstName = readLine().toString()
                println("Enter your last name")
                print(">  ")
                var lastName = readLine().toString()
                println("How old are you?")
                print(">  ")
                var age = input.nextInt()
                var unit = "School Head"
                println("What is your monthly take home?")
                print(">  ")
                var salary = input.nextInt()
                println("How many years of work experience do you have")
                print(">  ")
                var yearsOfExperience = input.nextInt()
                var principal = Principal(
                    firstName = firstName,lastName=lastName,age=age,salary= salary,
                    yearsOfExperience=yearsOfExperience,unit = unit,address = principalAddress,
                    staffId="P${(1000 until 2000).random()}")
                principalHolder = principal
                println(principal.employeeDetail())
                println(principalHolder)
            } else{
                println("What would you like to do today")
                println("1: Admit students")
                println("2: Expel a student")
                var input = input.nextLine()
                if (input == "1"){
                    if (lisOfApplicants.size > 0){
                        for (applicant in lisOfApplicants){
                            if (applicant.getAge() >= 17){
                                listOfSelectedApplicants.add(applicant)
                                println(listOfSelectedApplicants)
                                println("Students admitted")
                            }
                            else{
                                println("""
                                    ${applicant.getFullName()} is not qualified for admission into Anthony Model School
                                    Please try again next session. Don't give up
                                    """.trimIndent())
                            }
                        }

                    }else{
                        println("There are no applicants yet")
                    }
                } else if (input == "2"){
                        var input = Scanner(System.`in`)
                        println("Enter the id of the student you wish to expel")
                        var studentId = input.nextLine()
                        for(student in listOfStudents){
                            if(student.getStudentId() == studentId){
                                listOfStudents.remove(student)
                            }
                        }
                        println(listOfStudents)
                    }
                }
            welcomeMessage()
            choice = readLine().toString()
        } else if (choice == "2"){
            println("Make your choice")

            println("1. Teaching Staff")
            println("2. Non Teaching Staff")
            var choice1 = readLine().toString()

            if (choice1 == "1"){
                println("Enter your country here")
                print(">  ")
                var country:String = readLine().toString()
                println("Enter your state here")
                print(">  ")
                var state = readLine().toString()
                println("Enter your city here")
                print(">  ")
                var city = readLine().toString()
                println("What is the name of your street?")
                print(">  ")
                var street = readLine().toString()
                println("What is your house number?")
                print(">  ")
                var houseNumber:Int = input.nextInt()
                var teacherAddress = Address(
                    country=country,state = state,city = city,
                    streetName = street,houseNumber=houseNumber)

                println("Enter your first name")
                print(">  ")
                var firstName = readLine().toString()
                println("Enter your last name")
                print(">  ")
                var lastName = readLine().toString()
                println("How old are you?")
                print(">  ")
                var age = input.nextInt()
                var unit = "School Head"
                println("What is your take home?")
                print(">  ")
                var salary = input.nextInt()
                println("How many years of work experience do you have")
                print(">  ")
                var yearsOfExperience = input.nextInt()
                var teacher = Teacher(
                    firstName = firstName,lastName=lastName,age=age,salary= salary,
                    yearsOfExperience=yearsOfExperience,unit = unit,address = teacherAddress,
                    staffId = "TD${(1000 until 2000).random()}")
                teacherHolder = teacher
                listOfTeachers.add(teacher)
                println(listOfTeachers)
                println(teacher.employeeDetail())

                welcomeMessage()
                choice1 = readLine().toString()

            } else if (choice1 == "2"){
                println("Enter your country here")
                print(">  ")
                var country:String = readLine().toString()
                println("Enter your state here")
                print(">  ")
                var state = readLine().toString()
                println("Enter your city here")
                print(">  ")
                var city = readLine().toString()
                println("What is the name of your street?")
                print(">  ")
                var street = readLine().toString()
                println("What is your house number?")
                print(">  ")
                var houseNumber:Int = input.nextInt()
                var nonTeacherAddress = Address(
                    country=country,state = state,city = city,
                    streetName = street,houseNumber=houseNumber)

                println("Enter your first name")
                print(">  ")
                var firstName = readLine().toString()
                println("Enter your last name")
                print(">  ")
                var lastName = readLine().toString()
                println("How old are you?")
                print(">  ")
                var age = input.nextInt()
                var unit = "School Head"
                println("What is your take home?")
                print(">  ")
                var salary = input.nextInt()
                println("How many years of work experience do you have")
                print(">  ")
                var yearsOfExperience = input.nextInt()
                var nonTeacher = NonTeachingStaff(
                    firstName = firstName,lastName=lastName,age=age,salary= salary,
                    yearsOfExperience=yearsOfExperience,unit = unit,address = nonTeacherAddress,
                    staffId = "NT${(1000 until 2000).random()}")
                listOfNonTeachingStaff.add(nonTeacher)
                println(listOfNonTeachingStaff)
                println(nonTeacher.employeeDetail())

                println("Enter q to quit or select an option to continue")
                choice1 = readLine().toString()
            }

        } else if (choice == "3") {
            createNewStudent()
            println("Enter your first name")
            var name = input.nextLine()
            println("Enter your age")
            var age = input.nextInt()
            if (listOfSelectedApplicants.size > 0){
                for (selectedApplicant in listOfSelectedApplicants){
                    if (selectedApplicant.getFirstName()== name && selectedApplicant.getAge() == age){
                        createNewStudent()
                    }
                }
            } else{
                println("""
                    The principal is yet to admit students. 
                    Check back after the principal has admitted students
                    """)
            }

            println("Enter q to quit or ")
            welcomeMessage()
            choice = readLine().toString()

        } else if (choice == "4") {
            registerApplicant()

            println("Enter q to quit")
            introduce()
            choice = readLine().toString()


        } else{
            println("Invalid choice. enter 1 for principal, 2 for staff, 3 for student or 4 for applicant")
            println("Else, enter q to exit")
            print(">  ")
            choice = readLine()
        }
    }

}

fun createNewStudent(){
    var input = Scanner(System.`in`)
    println("Enter your country here")
    print(">  ")
    var country:String = readLine().toString()
    println("Enter your state here")
    print(">  ")
    var state = readLine().toString()
    println("Enter your city here")
    print(">  ")
    var city = readLine().toString()
    println("What is the name of your street?")
    print(">  ")
    var street = readLine().toString()
    println("What is your house number?")
    print(">  ")
    var houseNumber:Int = input.nextInt()
    var studentAddress = Address(
        country=country,state = state,city = city,
        streetName = street,houseNumber=houseNumber)

    var studentCourses = arrayListOf<String>()

    println("Enter the number of courses you're currently enrolled in")
    println(">  ")
    var numberOfCourses = input.nextInt()
    var count = 0
    var courseList = arrayListOf<String>()

    while (count < numberOfCourses) {
        println("Enter a course")
        print(">  ")
        var course = readLine().toString()
        courseList.add(course)
        count ++
    }


    println("Enter your first name")
    print(">  ")
    var firstName = readLine().toString()
    println("Enter your last name")
    print(">  ")
    var lastName = readLine().toString()
    println("How old are you?")
    print(">  ")
    var age = input.nextInt()

    var student = Student(firstName = firstName,lastName=lastName,
        age=age,courses = courseList,address = studentAddress)
    listOfStudents.add(student)
    println(student.getStudentDetail())
    println()
    println("Registered students: $listOfStudents")

}

fun registerApplicant(){
    var input = Scanner(System.`in`)
    println("Enter your country here")
    print(">  ")
    var country:String = readLine().toString()
    println("Enter your state here")
    print(">  ")
    var state = readLine().toString()
    println("Enter your city here")
    print(">  ")
    var city = readLine().toString()
    println("What is the name of your street?")
    print(">  ")
    var street = readLine().toString()
    println("What is your house number?")
    print(">  ")
    var houseNumber:Int = input.nextInt()
    var applicantAddress = Address(
        country=country,state = state,city = city,
        streetName = street,houseNumber=houseNumber)

    println("Enter your first name")
    print(">  ")
    var firstName = readLine().toString()
    println("Enter your last name")
    print(">  ")
    var lastName = readLine().toString()
    println("How old are you?")
    print(">  ")
    var age = input.nextInt()

    var applicant = Applicant(firstName = firstName,lastName=lastName,
        age=age)
    lisOfApplicants.add(applicant)
    println(applicant.getPerson())
}

fun expelStudent(): ArrayList<Student>{
    var input = Scanner(System.`in`)
    println("Enter student id here ")
    println(">  ")
    var studentId = input.nextLine()
    if (listOfStudents.size >= 0)
        for (student in listOfStudents){
            if (student.getStudentId() == studentId){
                println("${student.getFullName()} has been expelled from Anthony Model School and should henceforth to be " +
                        "treated as an outcast")
                listOfStudents.remove(student)

            }
        }
    else {
        println("You currently do not have any student")
    }
    return listOfStudents
}
fun introduce(){
    println("1. Principal")
    println("2. Staff")
    println("3. Student")
    println("4. Applicant")
    print(">  ")
}