package lambda.javaUtil.function;

import java.util.function.Function;

public class MainFunction {
    // PRIMEIRO Parâmetro: PARÂMETRO a ser passado
    // SEGUNDO Parâmetro: RETORNO da Função
    private static final Function<Integer, Integer> showNumber = number -> number;

    // Para usar as Funções CONCATENADAS, as demais Funções devem ter o MESMO Tipo do Parâmetro A SER PASSADO da
    // Função principal no Tipo de RETORNO!!!!!
    // OBS: O Resultado SEMPRE vai ser da ÚLTIMA Função CONCATENADA!!
    private static final Function<Integer, String> printNumber = number -> "O número informado é: " + number;

    public static void main(String[] args) {
        System.out.println(MainFunction.showNumber.andThen(printNumber).apply(10));
    }
}
