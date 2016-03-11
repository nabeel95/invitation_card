import java.util.HashMap;
import java.util.Map;

public class InvitationLabel {
    String[] args;

    public InvitationLabel(String[] args) {
        this.args = args;
    }

    public String printLabel() {
        DataReader reader = new DataReader(args[1]);
        String wholeData = reader.getData();
        String result = "";

        Map<String, Format> commandsWithFunction = new HashMap<>();

        commandsWithFunction.put("-ff",new Formal(wholeData));
        commandsWithFunction.put("-ffb",new Formal(wholeData));

        commandsWithFunction.put("-lf",new Informal(wholeData));
        commandsWithFunction.put("-lfb",new Informal(wholeData));

        if (args.length>2) {
            commandsWithFunction.put("-ffc", new FormalWithCountry(wholeData, args[2]));
            commandsWithFunction.put("-ffcb", new FormalWithCountry(wholeData, args[2]));

            commandsWithFunction.put("-lfc", new InformalWithCountry(wholeData, args[2]));
            commandsWithFunction.put("-lfcb", new InformalWithCountry(wholeData, args[2]));
        }
        if (args.length>3) {
            commandsWithFunction.put("-ffca", new FormalCountryAndAge(wholeData, args[2], Integer.parseInt(args[3])));
            commandsWithFunction.put("-ffcab", new FormalCountryAndAge(wholeData, args[2], Integer.parseInt(args[3])));

            commandsWithFunction.put("-lfca", new InformalCountryAndAge(wholeData, args[2], Integer.parseInt(args[3])));
            commandsWithFunction.put("-lfcab", new InformalCountryAndAge(wholeData, args[2], Integer.parseInt(args[3])));
        }

        Format format = commandsWithFunction.get(args[0]);
        result += format.print(args[0]);

        return result;
    }
}
