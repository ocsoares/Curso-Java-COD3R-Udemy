package lambda.learn;

import java.util.function.BinaryOperator;

public class FirstLambda {
    // "(Integer::sum)" é a MESMA COISA que "...(number, otherNumber) -> number + otherNumber;" !!!!!
    private static final ICalculation sumLambda = Integer::sum;
    private static final ICalculation multiplicationLambda = (number, otherNumber) -> number * otherNumber;

    // Isso faz a MESMA coisa, pq recebe DOIS PARÂMETROS e RETORNA o Tipo informado !!!
    // OBS: Pesquisar sobre outras Interfaces parecidas, na lib "java.util.function" !!
    private static final BinaryOperator<Integer> sumLambdaJava = Integer::sum;

    public static void main(String[] args) {
        System.out.println(FirstLambda.sumLambda.execute(2, 2));
        System.out.println(FirstLambda.multiplicationLambda.execute(10, 5));

        System.out.println(FirstLambda.sumLambdaJava.apply(3, 7));
    }
}
