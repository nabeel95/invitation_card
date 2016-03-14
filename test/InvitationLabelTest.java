import org.junit.Assert;
import org.junit.Test;

public class InvitationLabelTest {
    @Test
    public void invitation_label_should_take_args_and_print_label_accordingly() throws Exception {
        String[] args = {"-ff","./data/dataToTest.txt"};
        InvitationLabel label = new InvitationLabel(args);
        String expected = "Ms Brandt Huel\nMs Velma Bergstrom\n";
        Assert.assertEquals(expected,label.printLabel());
    }


    @Test
    public void invitation_label_should_take_args_and_print_label_according_to_command() throws Exception {
        String[] args = {"-lf","./data/dataToTest.txt"};
        InvitationLabel label = new InvitationLabel(args);
        String expected = "Ms Huel,Brandt\nMs Bergstrom,Velma\n";
        Assert.assertEquals(expected,label.printLabel());
    }


}
