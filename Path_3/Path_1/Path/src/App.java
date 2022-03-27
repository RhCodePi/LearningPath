import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Path directionData = Paths.get(String.format("C:\\%s\\%s\\%s\\%s\\%s\\%s\\%s"), "JavaProject","JavaLearningPath",
        //                              "LearningPath", "Path_3", "Path_1", "Path", "students.txt");
        Path p1 = Paths.get("C:/JavaProject/JavaLearningPath/LearningPath/Path_3/Path_1/Path/students.txt");
        //String addressData = "C:/JavaProject/JavaLearningPath/LearningPath/Path_3/Path_1/Path/students.txt";
        StudentList studentsList = new StudentList(p1);
        while(true)
        {
            System.out.println(StudentList.Listed());
            System.out.println("1.Ekle");
            System.out.println("2.Sil");
            System.out.println("3.Cikis");
            Scanner scanners = new Scanner(System.in);
            int selection = scanners.nextInt();
            scanners.nextLine();
            if(selection == 1 )
            {
                System.out.println("IdNo : ");
                String idNo = scanners.nextLine();
                System.out.println("Name :");
                String name = scanners.nextLine();
                System.out.println("Address : ");
                String address = scanners.nextLine();

                Students students = new Students(idNo, name, address);
                studentsList.Add(students);
            }
            if(selection == 2)
            {
                System.out.println("Enter remove value");
                int index = scanners.nextInt();
                studentsList.Remove(index);
            }
            if(selection == 3)
            {
                studentsList.SaveAsFolder();
                break;
            }
        }
    }
}
