
public class InvitationMain {
    public static void main(String[] args) throws Exception {
        if(args.length<2 || args[0].equals("-h")){
            System.out.println("usage:-\n" +
                               "      <-ff> <filePath> -                    first name first format.\n" +
                               "      <-lf> <filePath> -                    last name first format.\n" +
                               "      <-ffc> <filePath> <country> -         first name first format along with country.\n" +
                               "      <-lfc> <filePath> <country> -         last name first format along with country.\n" +
                               "      <-ffca> <filePath> <country> <age> -  first name first format along with country and age.\n" +
                               "      <-lfca> <filePath> <country> <age> -  last name first formal along with country and age.");
        }
        else {
            DataReader reader = new DataReader(args[1]);
            String wholeData = reader.getData();
            switch (args[0]) {
                case "-ff":
                    Format firstNameFirst = new Formal(wholeData);
                    System.out.println(firstNameFirst.print());
                    break;
                case "-lf":
                    Format lastNameFirst = new Informal(wholeData);
                    System.out.println(lastNameFirst.print());
                    break;
                case "-ffc":
                    Format firstNameFirstWithCountry = new FormalWithCountry(wholeData,args[2]);
                    System.out.println(firstNameFirstWithCountry.print());
                    break;
                case "-lfc":
                    Format lastNameFirstWithCountry = new InformalWithCountry(wholeData,args[2]);
                    System.out.println(lastNameFirstWithCountry.print());
                    break;
                case "-ffca":
                    Format firstNameFirstWithCountryAndAge = new FormalCountryAndAge(wholeData,args[2],Integer.parseInt(args[3]));
                    System.out.println(firstNameFirstWithCountryAndAge.print());
                    break;
                case "-lfca":
                    Format lastNameFirstWithCountryAndAge = new InformalCountryAndAge(wholeData,args[2],Integer.parseInt(args[3]));
                    System.out.println(lastNameFirstWithCountryAndAge.print());
                    break;
            }
        }
    }
}
