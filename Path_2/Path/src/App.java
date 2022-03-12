import java.util.*;

class Queue{
    private int elementCount = 0;
    private int pointer = 0;
    private List<Integer> queue;

    public Queue(int elementCount)
    {
        this.elementCount = elementCount;
        queue = new ArrayList<>();
    }

    int add(int addOfElement)
    {
        if(pointer++ == elementCount)
        {
            return -1;
        }
        queue.add(addOfElement);
        return addOfElement; 
    }

    int remove()
    {
       if(pointer == 0)
            return -1;
        int value = queue.get(0);
        queue.remove(0);
        pointer--;
        return value;
    }

    String listOfArray()
    {
        String outOfList = "";
        for(int i = 0; i<pointer; i++)
        {
            outOfList += queue.get(i) + "<-";
        }
        return outOfList;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(10);

        System.out.println(queue.add(1));
        System.out.println(queue.listOfArray());
        System.out.println(queue.add(2));
        System.out.println(queue.listOfArray());
        System.out.println(queue.remove());

    }
}
