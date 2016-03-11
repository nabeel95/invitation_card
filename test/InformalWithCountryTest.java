import org.junit.Assert;
import org.junit.Test;

public class InformalWithCountryTest {
    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_two_lines() throws Exception {
        InformalWithCountry data = new InformalWithCountry("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh","Bangladesh");
        Assert.assertEquals("Ms Dooley,Melody,Bangladesh",data.print("-lfc"));
    }

    @org.junit.Test
    public void Second_Format_should_be_able_to_print_for_more_than_two_lines() throws Exception {
        String str = "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\nCarlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh\nBrandt,Huel,Female,25,West Shanna,Illinois,Macedonia\nJulius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        InformalWithCountry data = new InformalWithCountry(str,"Bangladesh");
        Assert.assertEquals("Mr Johns,Carlos,Bangladesh\n" +
                "Ms Dooley,Melody,Bangladesh",data.print("-lfc"));
    }

    @Test
    public void informal_with_country_with_border_should_print_name_and_address_with_borders() throws Exception {
        InformalWithCountry data = new InformalWithCountry("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh", "Bangladesh");
        String expected = "+----------------------+\n" +
                          "| Ms Dooley,Melody     |\n" +
                          "+----------------------+\n" +
                          "| West Shanna, Vermont |\n" +
                          "| Bangladesh           |\n" +
                          "+----------------------+";
        Assert.assertEquals(expected, data.print("-lfcb"));
    }
}
