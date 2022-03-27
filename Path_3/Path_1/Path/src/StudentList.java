import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private Path addressData;
    private static List<Students> students;
    private Students parcel(String line)
    {
        String[] splits = line.split("-");
        return new Students(splits[0], splits[1],splits[2]);
    }

    public StudentList(Path addressData)
    {
        this.addressData = addressData;
        students = new ArrayList<>();

        try {
            if(Files.exists(addressData))
            {
                List<String> lines = Files.readAllLines(addressData);
                for (String line : lines) {
                    Students std = parcel(line);
                    students.add(std);
                }
            }
            else {
                Files.createFile(addressData);
            }
          
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void Add(Students student)
    {
        students.add(student);
    }
    public void Remove(int index)
    {
        students.remove(index);
    }
    public void SaveAsFolder()
    {
        List<String> output = new ArrayList<>();
        for(Students student : students)
        {
            output.add(student.toString());
        }
        try {
            Files.write(addressData, output);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public static String Listed()
    {
        StringBuilder output = new StringBuilder();
        int i = 0;
        for(Students student : students)
        {
            output.append(i++).append(" ").append(student.toString()).append("\n");
        }
        return output.toString();
    }

}
