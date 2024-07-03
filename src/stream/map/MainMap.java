package stream.map;

import stream.Car;

import java.util.List;

public class MainMap {
    private static final Car firstCar = new Car("Peugeot", "Boxer", 2008);
    private static final Car secondCar = new Car("Ford", "Ka", 2011);

    private static final List<Car> carList = List.of(firstCar, secondCar);

    public static void main(String[] args) {
        List<String> carBrandList = MainMap.carList.stream().map(Car::brand).toList();
        System.out.println(carBrandList);

        List<String> carNameList = MainMap.carList.stream().map(car -> car.name().toUpperCase()).toList();
        System.out.println(carNameList);
    }
}
