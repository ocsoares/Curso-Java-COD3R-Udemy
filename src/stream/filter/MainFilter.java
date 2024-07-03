package stream.filter;

import stream.Car;

import java.util.List;

public class MainFilter {
    private static final Car firstCar = new Car("Peugeot", "Boxer", 2011);
    private static final Car secondCar = new Car("Ford", "Ka", 2008);
    private static final Car thirdCar = new Car("Nissan", "Versa", 2015);

    private static final List<Car> carList = List.of(firstCar, secondCar, thirdCar);

    public static void main(String[] args) {
        List<Car> carListYearBiggerThenTwentyTen = MainFilter.carList.stream()
                .filter(car -> car.year() > 2010)
                .toList();

        System.out.println(carListYearBiggerThenTwentyTen);

        // Usando "filter" com "map" !!!
        List<String> carListWithCustomText = MainFilter.carList.stream()
                .filter(car -> car.year() > 2010)
                .map(car -> "O carro chamado " + car.name() + " da marca " + car.brand() + " é de um ano maior que 2010 !")
                .toList();

        System.out.println(carListWithCustomText);
    }
}
