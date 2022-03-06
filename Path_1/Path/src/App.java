
class Person {
    // This is Person Class.
    private String name;
    private String surname;
    private byte old;
    
    public String toString()
    {
        return name + "  " + surname + "  " + old;
    }

    public Person(String name, String surname, byte old)
    {
        this.name = name;
        this.surname = surname;
        this.old = old;
    }


}


public class App {
    public static void main(String[] args) throws Exception {
        // initial the Person class
        Person newPerson = new Person("Abdullah", "Vural",(byte) 20);
        
        System.out.println(newPerson);


    }
}
