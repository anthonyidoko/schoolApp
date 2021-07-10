import org.junit.Test
import kotlin.test.assertEquals

internal class TeacherTest {

    val teacherAddress = Address(
        country = "Nigeria",
        state = "FCT",
        city = "Abuja",
        streetName = "Lawal way",
        houseNumber = 4
    )

    val teacher = Teacher(
        firstName = "Anthony",
        lastName = "Idoko",
        age = 12,
        salary = 234,
        yearsOfExperience = 4,
        unit = "Science",
        "STF3214",
        address = teacherAddress
    )

    @Test
    fun test_Can_Do_Function_Of_Teacher() {

        assertEquals("Can teach a course",teacher.canDo())
    }
}