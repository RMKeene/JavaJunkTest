import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        var numbers = Arrays.asList(11, 22, 33, 44,
        55, 66, 77, 88,
        99, 100);

        numbers.forEach(number
                        -> System.out.print(
                            number + " "));
    }
}