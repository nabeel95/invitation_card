
public class TryingWorking {
    public static void main(String[] args) throws Exception {
        Invitation invitation = new Invitation("./data/records.txt");
        System.out.println(invitation.getFormatTwo());
    }
}
