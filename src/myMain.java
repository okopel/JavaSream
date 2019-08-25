import java.util.LinkedList;
import java.util.List;

public class myMain {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            //myList.add(new Random().nextInt());
            myList.add(i);
        }
        myList.stream().filter(x -> x % 5 == 0).map(myMain::pow2).forEach(System.out::println);
    }

    public static int pow2(int x) {
        return x * x;
    }


}
