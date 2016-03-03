import org.junit.Assert;

public class FirstFormatTest {
    @org.junit.Test
    public void First_Format_should_be_able_to_print_for_two_lines() throws Exception {
        FirstFormat data = new FirstFormat("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        Assert.assertEquals("Ms Julius Barrows\nMs Melody Dooley",data.print());
    }

    @org.junit.Test
    public void First_Format_should_be_able_to_print_for_more_than_two_lines() throws Exception {
        FirstFormat data = new FirstFormat("Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n" +
                                           "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh\n" +
                                           "Brandt,Huel,Female,25,West Shanna,Illinois,Macedonia\n"+
                                           "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n"+
                                           "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        Assert.assertEquals("Mr Gavin Hyatt\nMr Carlos Johns\nMs Brandt Huel\nMs Julius Barrows\nMs Melody Dooley",data.print());
    }
}
