import org.junit.Assert;
import org.junit.Test;

public class InformalTest {
    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_two_lines() throws Exception {
        Informal data = new Informal("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        Assert.assertEquals("Ms Barrows,Julius\n" +
                            "Ms Dooley,Melody",data.print("-lf"));
    }

    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_more_than_two_lines() throws Exception {
        Informal data = new Informal("Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n" +
                "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh\n" +
                "Brandt,Huel,Female,25,West Shanna,Illinois,Macedonia\n"+
                "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n"+
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        Assert.assertEquals("Mr Hyatt,Gavin\n" +
                            "Mr Johns,Carlos\n" +
                            "Ms Huel,Brandt\n" +
                            "Ms Barrows,Julius\n" +
                            "Ms Dooley,Melody",data.print("-lf"));
    }

    @Test
    public void formal_with_border_should_print_full_name_with_borders() throws Exception {
        Informal data = new Informal("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        String expected = "+-------------------+\n" +
                          "| Ms Barrows,Julius |\n" +
                          "+-------------------+";
        Assert.assertEquals(expected,data.print("-lfb"));
    }
}
