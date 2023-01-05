package Task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "Happy Birthday, %NAME!";
    public String generate(Client client){
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}