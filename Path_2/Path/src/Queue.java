import java.util.*;

public class Queue{
    private int elementCount = 0;
    private int pointer = 0;
    private List<Integer> queue;

    public Queue(int elementCount)
    {
        this.elementCount = elementCount;
        queue = new ArrayList<>();
    }

    public int add(int addOfElement)
    {
        if(pointer++ == elementCount)
        {
            return -1;
        }
        queue.add(addOfElement);
        return addOfElement; 
    }

    public int remove()
    {
       if(pointer == 0)
            return -1;
        int value = queue.get(0);
        queue.remove(0);
        pointer--;
        return value;
    }

    public String listOfArray()
    {
        StringBuilder builder = new StringBuilder();
        for (Integer element: queue) {
            builder.append(element);
            builder.append("<-");
        }
        return builder.toString();
    }

}