import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomList{
    Random random;
    public RandomList(){
        random = new Random();
    }
    public List<Integer> GenerateList(int listLength)
    {
        List<Integer> listOfInteger = new ArrayList<>();
        
        for(int i = 0; i< listLength; i++)
        {
            listOfInteger.add(random.nextInt());
        }
        return listOfInteger;
    }

    public List<Integer> GenerateList(int listLength, int minListElement)
    {
        List<Integer> listOfInteger = new ArrayList<>();
        
        for(int i = 0; i< listLength; i++)
        {
            //listOfInteger.add(random.nextInt(minListElement, Integer.MAX_VALUE));
        }
        return listOfInteger;
    }

    public List<Integer> GenerateList(int listLength, int minListElement, int maxListElement)
    {
        List<Integer> listOfInteger = new ArrayList<>();
        
        for(int i = 0; i< listLength; i++)
        {
            //listOfInteger.add(random.nextInt(minListElement, maxListElement));
        }
        return listOfInteger;
    }



}


public class App {

    static void Listed(List<Integer> list)
    {
        for(Integer element : list)
        {
            System.out.println(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        RandomList rnd = new RandomList();
        List<Integer> result = rnd.GenerateList(5);
        System.out.println(result); 
    }
}
