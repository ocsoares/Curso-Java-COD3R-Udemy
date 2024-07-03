package stream.minAndMax;

import stream.Car;

import java.util.Comparator;
import java.util.List;

public class MainMinAndMax {
    private static final Car firstCar = new Car("Peugeot", "Boxer", 2011);
    private static final Car secondCar = new Car("Ford", "Ka", 2008);
    private static final Car thirdCar = new Car("Nissan", "Versa", 2015);

    private static final List<Car> carList = List.of(firstCar, secondCar, thirdCar);

    public static void main(String[] args) {
        // "orElseThrow" no lugar de "get" para NÃO retornar OPTIONAL!!!
        Car carWithLowestYear = MainMinAndMax.carList.stream().min(Comparator.comparingInt(Car::year)).orElseThrow();
        System.out.println("carWithLowestYear: " + carWithLowestYear);

        Car carWithBiggestYear = MainMinAndMax.carList.stream().max(Comparator.comparingInt(Car::year)).orElseThrow();
        System.out.println("carWithBiggestYear: " + carWithBiggestYear);
    }
}
