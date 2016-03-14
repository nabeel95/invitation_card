package format;

import guestinfo.Name;
import guestinfo.Person;

import java.util.List;

public class NameCountryAndAgeRep implements Format {
    String res = "";
    List<Person> list;
    String country;
    int age;

    public NameCountryAndAgeRep(List<Person> list, String country, int age) {
        this.list = list;
        this.country = country;
        this.age = age;
    }


    @Override
    public String print(String arg) {
        String result = "";
        if (arg.equals("-ffca"))
            result += printInFormalForm();
        else if (arg.equals("-lfca"))
            result += printInInformalForm();
        return result;
    }

    private String printInFormalForm() {
        for (Person p : list) {
            if (p.isCitizenOf(this.country) && p.isOlderThan(this.age)) {
                Name name = p.getName();
                res += p.getPrefix() + " " + name.getFormalRepresentation() + "," + this.country + "," + p.getAge();
                res += "\n";
            }
        }
        return res;
    }

    private String printInInformalForm() {
        for (Person p : list) {
            if (p.isCitizenOf(this.country) && p.isOlderThan(this.age)) {
                Name name = p.getName();
                res += p.getPrefix() + " " + name.getInformalRepresentation() + "," + this.country + "," + p.getAge();
                res += "\n";
            }
        }
        return res;
    }
}
