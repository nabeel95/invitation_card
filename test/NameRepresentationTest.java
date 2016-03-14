import format.NameRepresentation;
import guestinfo.Person;
import org.junit.Assert;
import org.junit.Before;

import java.util.LinkedList;

public class NameRepresentationTest {

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
        NameRepresentation data = new NameRepresentation(list);
        Assert.assertEquals("Ms Julius Barrows\nMs Melody Dooley\n", data.print("-ff"));
    }

    @org.junit.Test
    public void name_representation_should_print_name_informally_if_command_is_lf() throws Exception {
        NameRepresentation data = new NameRepresentation(list);
        Assert.assertEquals("Ms Barrows,Julius\nMs Dooley,Melody\n", data.print("-lf"));
    }

}



