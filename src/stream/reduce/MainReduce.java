package stream.reduce;

import java.util.List;

public class MainReduce {
    private static final List<Double> studentsNotes = List.of(2.10, 5.75, 8.90, 4.37, 6.32);

    public static void main(String[] args) {
//        Double sumStudentsNotes = MainReduce.studentsNotes.stream().reduce(Double::sum).get();

        // NÃO retorna OPTIONAL porque adicionando "0.0", o PRIMEIRO Elemento da Lista vai ser SOMADO com
        // 0.0, então SEMPRE vai retornar um Double!!!
        Double sumStudentsNotes = MainReduce.studentsNotes.stream().reduce(0.0, Double::sum);
        System.out.println(sumStudentsNotes);

        Double notesBiggerThanFiveSummed = MainReduce.studentsNotes.stream()
                .filter(note -> note > 5)
                .reduce(0.0, Double::sum);

        System.out.println(notesBiggerThanFiveSummed);
    }
}
