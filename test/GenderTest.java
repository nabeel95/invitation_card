import guestinfo.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderTest {
    @Test
    public void getGender_should_return_gender_when_a_person_is_male() throws Exception {
        Gender male = new Gender("Male");
        Assert.assertEquals("Male",male.getGender());
    }

    @Test
    public void getGender_should_return_gender_when_a_person_is_female() throws Exception {
        Gender female = new Gender("Female");
        Assert.assertEquals("Female",female.getGender());
    }

}
