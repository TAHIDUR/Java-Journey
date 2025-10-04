package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class example {

    public static void main (String[] args){
//        List<String> list = Arrays.asList("a", "bb", "ccc");
//        long x = list.stream().collect(Collectors.groupingBy(String::length)).size();
//        System.out.println(x);
//
//        List<String> names = Arrays.asList("Apple", "apple", "Banana");
//        names.sort(String::compareTo);
//        names.sort(String::compareToIgnoreCase);
//        System.out.println(names);
//
////        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> numbers = new ArrayList<>();
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        System.out.println(max.isPresent());

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);


    }

}
