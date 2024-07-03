package stream.match;

import stream.Car;

import java.util.List;
import java.util.function.Predicate;

public class MainMatch {
    private static final Car firstCar = new Car("Peugeot", "Boxer", 2011);
    private static final Car secondCar = new Car("Ford", "Ka", 2008);
    private static final Car thirdCar = new Car("Nissan", "Versa", 2015);

    private static final List<Car> carList = List.of(firstCar, secondCar, thirdCar);

    public static void main(String[] args) {
        Predicate<Car> isYearBiggerThanTwentyTen = (car -> car.year() > 2010);

        boolean isAllCarsListBiggerThanTwentyTen = carList.stream().allMatch(isYearBiggerThanTwentyTen);
        System.out.println("isAllCarsListBiggerThanTwentyTen: " + isAllCarsListBiggerThanTwentyTen);

        boolean isAnyCarListBiggerThanTwentyTen = carList.stream().anyMatch(car -> car.year() > 2010);
        System.out.println("isAnyCarListBiggerThanTwentyTen: " + isAnyCarListBiggerThanTwentyTen);

        boolean allNoneCarListBiggerThanTwentyTen = carList.stream().noneMatch(isYearBiggerThanTwentyTen);
        System.out.println("allNoneCarListBiggerThanTwentyTen: " + allNoneCarListBiggerThanTwentyTen);
    }
}
