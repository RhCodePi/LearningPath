class Queue{
    private int elementCount = 0;
    private int pointer = 0;
    private int[] queue;

    public Queue(int elementCount)
    {
        this.elementCount = elementCount;
        queue = new int[elementCount];
    }

    int add(int addOfElement)
    {
        queue[pointer] = addOfElement;
        pointer++;
        return addOfElement; 
    }

    int remove()
    {
        int value = queue[0];
        for(int i = 1; i<pointer; i++)
        {
            queue[i-1] =queue[i];
        }
        pointer--;
        return value;
    }

    String listOfArray()
    {
        String outOfList = "";
        for(int i = 0; i<pointer; i++)
        {
            outOfList += queue[i] + "<-";
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
