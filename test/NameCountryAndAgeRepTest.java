import format.NameCountryAndAgeRep;
import guestinfo.Person;
import org.junit.Assert;
import org.junit.Before;

import java.util.LinkedList;

public class NameCountryAndAgeRepTest {
    LinkedList<Person> list;
    @Before
    public void setup(){
        Person p1 = new Person("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        Person p2 = new Person("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        p1.initialiseValues();
        p2.initialiseValues();
        list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
    }

    @org.junit.Test
    public void name_representation_should_print_name_formally_if_command_is_ff() throws Exception {
        NameCountryAndAgeRep data = new NameCountryAndAgeRep(list,"Bangladesh",31);
        Assert.assertEquals("Ms Melody Dooley,Bangladesh,31\n", data.print("-ffca"));
    }

    @org.junit.Test
    public void name_representation_should_print_name_informally_if_command_is_lf() throws Exception {
        NameCountryAndAgeRep data = new NameCountryAndAgeRep(list,"Macedonia",18);
        Assert.assertEquals("Ms Barrows,Julius,Macedonia,18\n", data.print("-lfca"));
    }

}
