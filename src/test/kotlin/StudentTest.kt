import org.junit.Test
import kotlin.test.assertEquals

internal class StudentTest {
    val studentAddress = Address(
        country = "Nigeria",
        state = "FCT",
        city = "Abuja",
        streetName = "Lawal way",
        houseNumber = 4
    )
    val student = Student(
        firstName = "Anthony",
        lastName = "Idoko",
        age = 12,
        studentId = "STD3214",
        address = studentAddress,
        courses = arrayListOf("Maths","English")
    )
    @Test
    fun test_Student_Can_Do_Method() {
        assertEquals("Can take a course",student.canDo())
    }
}