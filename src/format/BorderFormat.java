package format;


import guestinfo.Name;
import guestinfo.Person;

import java.util.List;

public class BorderFormat implements Format {
    String res = "";
    List<Person> list;
    String country;

    public BorderFormat(List<Person> list, String country) {
        this.list = list;
        this.country = country;
    }

    @Override
    public String print(String arg) {
        String result = "";
        if (arg.equals("-ffb"))
            result += printInFormalForm();
        else if (arg.equals("-lfb"))
            result += printInInformalForm();
        return result;
    }

    public String patternMaker(int len, char replacer) {
        return new String(new char[len]).replace('\0', replacer);
    }

    public String[] borderMaker(Person person) {
        int nameLengthWithPrefix = person.getName().getFormalRepresentation().length() + 2;
        int cityAndStateLength = person.getCity().length() + person.getState().length();
        int countryLength = person.getCountry().length();
        int borderLength = nameLengthWithPrefix > cityAndStateLength ? nameLengthWithPrefix : cityAndStateLength;
        int[] lengths = new int[]{borderLength, borderLength - nameLengthWithPrefix, borderLength - cityAndStateLength, borderLength - countryLength};
        return new String[]{patternMaker(lengths[0] + 3, '-'), patternMaker(lengths[1] + 1, ' '), patternMaker(lengths[2] + 1, ' '), patternMaker(lengths[3] + 2, ' ')};
    }

    private String printInFormalForm() {
        for (Person p : list) {
            if (p.isCitizenOf(this.country)) {
                String[] borders = borderMaker(p);
                Name name = p.getName();
                res += "+" + borders[0] + "+\n| " + p.getPrefix() + " " + name.getFormalRepresentation() + borders[1] + "|\n|" + borders[0] + "|\n| " + p.getCity() + "," + p.getState() + borders[2] + "|\n| " + this.country + borders[3] + "|\n+" + borders[0] + "+";
                res += "\n";
            }
        }
        return res;
    }

    private String printInInformalForm() {
        for (Person p : list) {
            if (p.isCitizenOf(this.country)) {
                String[] borders = borderMaker(p);
                Name name = p.getName();
                res += "+" + borders[0] + "+\n| " + p.getPrefix() + " " + name.getInformalRepresentation() + borders[1] + "|\n|" + borders[0] + "|\n| " + p.getCity() + "," + p.getState() + borders[2] + "|\n| " + this.country + borders[3] + "|\n+" + borders[0] + "+";
                res += "\n";
            }
        }
        return res;
    }
}
