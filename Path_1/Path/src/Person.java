import java.time.LocalDate;

public class Person{
    private String name;
    private String surname;
    private Short born;
    private String school;

    public Person(String name, String surname, Short born)
    {
        this.name = name;
        this.surname = surname;
        this.born = born;
        school = "Invalid";
    }

    public Person(String name, String surname, Short born, String school)
    {
        this.name = name;
        this.surname = surname;
        this.born = born;
        this.school = school;
    }

    private byte CalculateAge()
    {
        return (byte)(LocalDate.now().getYear() - born);
    }

    public String toString()
    {
        if(school.equals("Invalid"))
        {
            return name + "  "  + surname + "  " + CalculateAge();
        }
        else
        {
            return name + "  " + surname + "  " + CalculateAge()+ "  " + school; 
        }
    }
}