import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList{
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