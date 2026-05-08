import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class SteamApi {
    public static void main(String[] args) {
        System.out.println("Hello, Steam API!");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Stream<Integer> s1 = numbers.stream();

        s1.forEach(n-> System.out.println(n)); 
        //s1.forEach(n-> System.out.println(n));  -> IllegalStateException: stream has already been operated upon or closed
        //stream can only be used once.
        //stream is for big data processing...
        //stream methods:
        //1. filter
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        s2.forEach(n-> System.out.println(n));

        Stream<Integer> s3 = s2.map(n -> n*2);
        s3.forEach(n-> System.out.println(n));

        int res = s3.reduce(0, (c,e) -> c+e);
        System.out.println(res);

        //multiple methods

        int reslmbda =numbers.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        System.out.println(reslmbda);

        //use of predicate interface + anonymous class

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==0;
            }
        };
        
        System.out.println(numbers.stream()
                .filter(p));

        //sort - other stream method
        numbers.stream()
                .sorted((a,b) -> b-a) //descending order
                .forEach(n -> System.out.println(n));
        
        //parallel stream - multile threads, do not use for sorting.
        numbers.parallelStream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));
    }
}
