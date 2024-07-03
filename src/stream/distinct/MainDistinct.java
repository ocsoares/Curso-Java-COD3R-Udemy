package stream.distinct;

import stream.Car;

import java.util.List;

public class MainDistinct {
    private static final Car firstCar = new Car("Peugeot", "Boxer", 2011);
    private static final Car secondCar = new Car("Ford", "Ka", 2008);
    private static final Car thirdCar = new Car("Nissan", "Versa", 2015);
    private static final Car fourthCar = new Car("Ford", "Ka", 2008);

    private static final List<Car> carList = List.of(firstCar, secondCar, thirdCar, fourthCar);

    public static void main(String[] args) {
        // Nesse caso, o "fourthCar" vai ser DESCARTADO, porque é IGUAL ao "secondCar" !!!
        List<Car> distinctListCar = MainDistinct.carList.stream().distinct().toList();
        System.out.println(distinctListCar);
    }
}