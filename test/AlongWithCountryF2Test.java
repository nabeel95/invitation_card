import org.junit.Assert;

public class AlongWithCountryF2Test {
    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_two_lines() throws Exception {
        AlongWithCountryFormatTwo data = new AlongWithCountryFormatTwo("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh","Bangladesh");
        Assert.assertEquals("Ms Dooley,Melody,Bangladesh",data.print());
    }

    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_more_than_two_lines() throws Exception {
        String str = "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\nCarlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh\nBrandt,Huel,Female,25,West Shanna,Illinois,Macedonia\nJulius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        AlongWithCountryFormatTwo data = new AlongWithCountryFormatTwo(str,"Bangladesh");
        Assert.assertEquals("Mr Johns,Carlos,Bangladesh\n" +
                "Ms Dooley,Melody,Bangladesh",data.print());
    }
}
