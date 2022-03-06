
class Person {
    // This is class but we use like a structure.
    private String name;
    private String surname;
    private byte old;

    public void setName(String name)
    {
        this.name = name;
    }

    public void SetSurname(String surname)
    {
        this.surname = surname;
    }

    public void setOld(Byte old)
    {
        this.old = old;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public Byte getOld()
    {
        return old;
    }


}


public class App {
    public static void main(String[] args) throws Exception {
        // initial the Person class
        Person newPerson = new Person();
        newPerson.setName("Abdullah");
        newPerson.SetSurname("Vural");
        newPerson.setOld((byte) 20);

        System.out.println(newPerson.getName() + "  " + newPerson.getSurname() + "   " + newPerson.getOld());


    }
}
