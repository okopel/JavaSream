import java.util.LinkedList;
import java.util.List;

public class myMain {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        for (int i = 1; i < 100; i++) {
            //myList.add(new Random().nextInt());
            myList.add(i);
        }
        myList.stream().
                filter(x -> x % 5 == 0).
                map(myMain::pow2).
                map(x -> (x / 2)).
                map(x -> pow2(x)).
                sorted((x, y) -> y - x). //big to small
                limit(10). //limit the elements
                forEach(System.out::println);

    }

    public static int pow2(int x) {
        return x * x;
    }


}
