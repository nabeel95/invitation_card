package format;

import guestinfo.*;

import java.util.List;

public class NameRepresentation implements Format {
    String res = "";
    List<Person> list;

    public NameRepresentation(List<Person> list) {
        this.list = list;
    }

    @Override
    public String print(String arg) {
        String result = "";
        if (arg.equals("-ff"))
            result += printInFormalForm();
        else if (arg.equals("-lf"))
            result += printInInformalForm();
        return result;
    }

    private String printInFormalForm() {
        for (Person p : list) {
            Name name = p.getName();
            res += p.getPrefix() + " " + name.getFormalRepresentation();
            res += "\n";
        }
        return res;
    }

    private String printInInformalForm() {
        for (Person p : list) {
            Name name = p.getName();
            res += p.getPrefix() + " " + name.getInformalRepresentation();
            res += "\n";
        }
        return res;
    }

}