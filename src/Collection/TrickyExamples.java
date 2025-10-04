package Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class TrickyExamples {
    public static void main(String[] args) {
        // ❌ Wrong understanding
        Collection<Integer> col = Collections.synchronizedList(new ArrayList<>());

        // ✅ Correct understanding
        List<Integer> syncedList = Collections.synchronizedList(new ArrayList<>());
        Collection<Integer> collection = syncedList; // Now it's a Collection



//        Fail-Fast vs Fail-Safe Iterators
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

// FAIL-FAST Iterator (throws ConcurrentModificationException)
        Iterator<Integer> it = list.iterator();
        list.add(4); // Structural modification
// it.next(); // Throws ConcurrentModificationException

// FAIL-SAFE Iterator (CopyOnWriteArrayList)
        List<Integer> copyList = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> safeIt = copyList.iterator();
        copyList.add(4); // No exception
        safeIt.next(); // Works fine - iterates over original snapshot

        HashMap<Integer, String> map = new HashMap<>();
        AbstractSet<Integer> set = new AbstractSet<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        // preserve access order
        Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);


        Hashtable<Integer, String> hashTable = new Hashtable<>();
    }
}
