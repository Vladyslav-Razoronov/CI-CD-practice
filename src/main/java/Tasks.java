import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(isEven(15));
        System.out.println(isEven(4));

        System.out.println(createGreeting("John"));

        List<Integer> numbers = Arrays.asList(4,8,16,-2,45,-85,90,-1,0);
        System.out.println(filterPositives(numbers));
    }

    public static boolean isEven(int n){
        return n%2 == 0;
    }

    public static String createGreeting(String name){
        return "Hello, "+name+"! How are you?";
    }

    public static List<Integer> filterPositives(List<Integer> input){
        return input.stream().filter(x->x>0).collect(Collectors.toList());
    }
}
