package lambda.forEach;

import java.util.List;

public class MainForEach {
    private static final List<String> randomNames = List.of("Maria", "Eduardo", "Ricardo", "João");

    public static void main(String[] args) {
        System.out.println(MainForEach.randomNames);

        MainForEach.randomNames.forEach(System.out::println);
    }
}
