
public class App {
    public static void main(String[] args) throws Exception {
        // initial the Person class
        Person newPerson = new Person("Abdullah", "Vural", (short) 2001);
        Person newPerson_1 = new Person("Abdullah", "Vural", (short) 2001, "Trakya Universty");

        System.out.println(newPerson);
        System.out.println(newPerson_1);

    }
}
