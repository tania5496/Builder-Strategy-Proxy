package Task1;

public class Main {
    public static void main(String[] args)  {
        User user = User.builder().name("Tetianka").age(18).gender(Gender.FEMALE).occupation("student").build();
        System.out.println(user);
    }
}
