
class Person {
    // This is class but we use like a structure.
    String name;
    String surname;
    byte old;
}


public class App {
    public static void main(String[] args) throws Exception {
        // initial the Person class
        Person newPerson;
        newPerson = new Person();
        newPerson.name = "Abdullah";
        newPerson.surname = "Vural";
        newPerson.old = 20;

        System.out.println(newPerson.name + "  " + newPerson.surname + "   " + newPerson.old);


    }
}
