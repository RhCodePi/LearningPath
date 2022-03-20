import java.util.List;

public class App {

    static <T> void Listed(List<T> list)
    {
        for(T element : list)
        {
            System.out.println(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println();
        RandomList rnd = new RandomList();
        List<Integer> result = rnd.GenerateList(5);
        Listed(result);
    }
}
