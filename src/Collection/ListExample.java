package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(55);
        list.add(33);
        list.add(44);
        list.add(33);
        list.add(null);
        list.add(null);
        list.add(4, 44);
//        list.add(null, 65);  // Compile time exception

        System.out.println(list);
        System.out.println(list.get(6));
//        System.out.println(list.get(8)); // IndexOutOfBoundsException

        ConcurrentSkipListMap<Integer, String> concurrentMap =
                new ConcurrentSkipListMap<>((a, b) -> b.compareTo(a));

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1, null);
    }
}
