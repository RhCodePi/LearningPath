public class Person{
    private String name;
    private String surname;
    private Byte old;
    private String school;

    public Person(String name, String surname, Byte old)
    {
        this.name = name;
        this.surname = surname;
        this.old = old;
        school = "Not Valid";
    }

    public Person(String name, String surname, Byte old, String school)
    {
        this.name = name;
        this.surname = surname;
        this.old = old;
        this.school = school;
    }

    public String toString()
    {
        if(school.equals("Not Valid"))
        {
            return name + "  "  + surname + "  " + old;
        }
        else
        {
            return name + "  " + surname + "  " + old + "  " + school; 
        }
    }
}