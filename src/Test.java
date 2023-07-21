import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    // Java 8 Feature


    public static void main(String[] args) throws Exception {


//        Stream.of(1, 2, 3, 4, 5, 6, 7)
//                .filter(integer -> integer % 2 == 0)
//                .limit(2)     // get value based on limit size
//                .skip(1)         /// to skip first n value
//                .forEach(System.out::println);

     // Stream.of(1, 2, -3, 4, 5)
     //         .filter(i -> i % 2 == 0)
     //         .peek(System.out::println).toArray();

       // integerStream.map(e->e*2)
       //         .forEach(System.out::println);

       // List<Integer> collect = integerStream.collect(Collectors.toList());


        List<Stream<String>> collect = Files.lines(Paths.get("flatmap.txt"))
                .map(line -> line.split(" "))
                .map(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        //System.out.println(collect);

        List<String> words = Files.lines(Paths.get("flatmap.txt"))
                .map(line -> line.split(" "))
                .flatMap(array -> Arrays.stream(array))
                .collect(Collectors.toList());
        System.out.println(words);

        // get the duplicate words
        HashMap<String,Integer> hm = new HashMap<>();
        for (String word : words) {
            if (hm.containsKey(word)) {
                hm.put(word, hm.get(word) + 1);
            } else {
                hm.put(word, 1);
            }
        }
        //System.out.println(hm);

        Map<String, Long> counts = words.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        //System.out.println(counts);
     //  counts.entrySet()
     //          .stream()
     //          .filter(name -> name.getValue()>1)
     //          .forEach(System.out::println);


        Map<String, Integer> collect1 = words.stream().
                collect(Collectors.toMap(Function.identity(), e -> 1, Integer::sum));
        //System.out.println(collect1);



    }

}
