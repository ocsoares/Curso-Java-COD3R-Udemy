package lambda.learn;

// GARANTE que a Interface seja para usar com LAMBDAS, ou seja, TEM que ter
// um ÚNICO Método!!!
@FunctionalInterface
public interface ICalculation {
    // Esses PARÂMETROS vão ser usados ao EXECUTAR a Lambda, e NÃO ao montar ela!!!
    // OBS: Ao montar ela, pode passar SEM NENHUM Tipo!!
    // OBS2: Deve ser a MESMA QUANTIDADE de Parâmetros AO MONTAR a Lambda!!
    Integer execute(Integer number, Integer otherNumber);
}
