
public class InvitationMain {
    public static void main(String[] args) throws Exception {
        String usage = ("usage:-\n" +
                "      <-ff>   <filePath> -                     First name first format.\n" +
                "      <-lf>   <filePath> -                     Last name first format.\n" +
                "      <-ffc>  <filePath> <country> -           First name first format along with country.\n" +
                "      <-ffb>  <filePath> <country> -          First name first format along with country with border.\n" +
                "      <-lfc>  <filePath> <country> -           Last name first format along with country.\n" +
                "      <-lfb>  <filePath> <country> -          Last name first format along with country with border.\n" +
                "      <-ffca> <filePath> <country> <age> -     First name first format along with country and age.\n" +
                "      <-lfca> <filePath> <country> <age> -     Last name first formal along with country and age.");


        if (args.length < 2 || args[0].equals("-h")) {
            System.out.println(usage);
        } else {
            InvitationLabel label = new InvitationLabel(args);
            System.out.println(label.printLabel());
        }
    }
}