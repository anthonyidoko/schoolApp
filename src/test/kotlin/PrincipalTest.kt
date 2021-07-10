import org.junit.Test
import kotlin.test.assertEquals

internal class PrincipalTest {
    // Create an address for principal
    var principalAddress = Address(
        country = "Nigeria",
        state = "FCT",
        city = "Abuja",
        streetName = "lawal street",
        houseNumber = 2
    )

    //Create principal object
    var principal = Principal(
        firstName = "Anthony",
        lastName = "Idoko",
        age = 65,
        salary = 243,
        yearsOfExperience = 12,
        unit = "School Head",
        address = principalAddress,
        staffId = "Pr001"
    )

    @Test
    fun test_Can_Do_Function_Principal_Without_Parameter() {

        //Test the method
        assertEquals("${principal.getFullName()} can expel a student",principal.canDo())

    }


    @Test
    fun test_Can_Do_Function_Principal_With_Parameter_Age() {
        //Test the method
        assertEquals("Mr ${principal.getFullName()} can admit applicant",principal.canDo(19))

    }
}