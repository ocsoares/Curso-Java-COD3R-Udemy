package lambda.javaUtil.biFunction;

import java.util.function.BiFunction;

public class MainBiFunction {
    // PARÂMETRO, PARÂMETRO, RETORNO
    private static final BiFunction<Double, Integer, Boolean> isNumberBiggerThenTwelve = (number, otherNumber) -> number + otherNumber > 20;

    public static void main(String[] args) {
        System.out.println(MainBiFunction.isNumberBiggerThenTwelve.apply(10.2, 5));

    }
}
