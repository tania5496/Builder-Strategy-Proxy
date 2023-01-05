package Task2;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class Client {
    private int id;
    private static int counter = 1;
    private String name;
    private int age;
    private Gender sex;
    private String mail;


    public Client(String name, int age, Gender sex, String mail){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;

        id = counter++;
    }
}
