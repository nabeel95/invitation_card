import format.*;
import guestinfo.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvitationLabel {
    String[] args;

    public InvitationLabel(String[] args) {
        this.args = args;
    }

    public String printLabel() {
        DataReader reader = new DataReader(args[1]);
        List<Person> wholeList = reader.getData();
        String result = "";

        Map<String, Format> commandsWithFunction = new HashMap<>();

        String country = (args.length > 2) ? args[2] : null;
        int age = (args.length > 3) ? Integer.parseInt(args[3]) : 0;

        commandsWithFunction.put("-ff", new NameRepresentation(wholeList));
        commandsWithFunction.put("-lf", new NameRepresentation(wholeList));

        commandsWithFunction.put("-ffc", new NameAndCountryRep(wholeList, country));
        commandsWithFunction.put("-lfc", new NameAndCountryRep(wholeList, country));

        commandsWithFunction.put("-ffca", new NameCountryAndAgeRep(wholeList, country, age));
        commandsWithFunction.put("-lfca", new NameCountryAndAgeRep(wholeList, country, age));

        commandsWithFunction.put("-ffb", new BorderFormat(wholeList, country));
        commandsWithFunction.put("-lfb", new BorderFormat(wholeList, country));


        Format format = commandsWithFunction.get(args[0]);
        result += format.print(args[0]);

        return result;
    }
}
