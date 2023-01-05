package Task1;

public class Main {
    public static void main(String[] args)  {
        User user = User.builder().name("Tetianka").age(18).gender(Gender.FEMALE).occupation("student").occupation("sport").build();
        System.out.println(user);
    }
}
