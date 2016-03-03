import org.junit.Assert;

public class SecondFormatTest {
    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_two_lines() throws Exception {
        SecondFormat data = new SecondFormat("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        Assert.assertEquals("Ms Barrows,Julius\n" +
                            "Ms Dooley,Melody",data.print());
    }

    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_more_than_two_lines() throws Exception {
        SecondFormat data = new SecondFormat("Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n" +
                "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh\n" +
                "Brandt,Huel,Female,25,West Shanna,Illinois,Macedonia\n"+
                "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n"+
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        Assert.assertEquals("Mr Hyatt,Gavin\n" +
                            "Mr Johns,Carlos\n" +
                            "Ms Huel,Brandt\n" +
                            "Ms Barrows,Julius\n" +
                            "Ms Dooley,Melody",data.print());
    }
}
