package format;

import guestinfo.Name;
import guestinfo.Person;

import java.util.List;

public class NameAndCountryRep implements Format {
    String res = "";
    List<Person> list;
    String country;

    public NameAndCountryRep(List<Person> list, String country) {
        this.list = list;
        this.country = country;
    }

    @Override
    public String print(String arg) {
        String result = "";
        if (arg.equals("-ffc"))
            result += printInFormalForm();
        else if (arg.equals("-lfc"))
            result += printInInformalForm();
        return result;
    }

    private String printInFormalForm() {
        for (Person p : list) {
            if (p.isCitizenOf(this.country)) {
                Name name = p.getName();
                res += p.getPrefix() + " " + name.getFormalRepresentation() + "," + this.country;
                res += "\n";
            }
        }
        return res;
    }

    private String printInInformalForm() {
        for (Person p : list) {
            if (p.isCitizenOf(this.country)) {
                Name name = p.getName();
                res += p.getPrefix() + " " + name.getInformalRepresentation() + "," + this.country;
                res += "\n";
            }
        }
        return res;
    }
}
