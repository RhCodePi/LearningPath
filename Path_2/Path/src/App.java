public class App {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(10);
        int[] array = new int[]{1, 2, 3, 4};
        int nextEleman = 0;
        Boolean[] oparatorArray = new Boolean[]{true, true, false, true, true};
        for (Boolean oparation : oparatorArray) {
            if(oparation)
            {
                System.out.println("Added element : " + queue.add(array[nextEleman++]));
            }
            else {
                System.out.println("Remove element: " + queue.remove());
            }
            System.out.println(queue.listOfArray());
        }

    }
}
