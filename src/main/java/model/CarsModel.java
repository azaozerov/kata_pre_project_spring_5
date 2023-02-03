package model;

import java.util.ArrayList;
import java.util.List;

public class CarsModel {
    private static CarsModel carsModel;
    private List<Car> cars = new ArrayList<>();

    public static CarsModel getCarsModel(){
        if (carsModel == null) {
            carsModel = new CarsModel();
            carsModel.addCar(new Car("ЗИЛ", "34 56 шо", "Иван" ));
            carsModel.addCar(new Car("Волга", "а821ое77", "Сергей" ));
            carsModel.addCar(new Car("Москвич", "12 98 ае", "Митрофан" ));
            carsModel.addCar(new Car("Mercedes", "с050рм177", "Кирилл" ));
            carsModel.addCar(new Car("Трактор", "е937ео159", "Петр" ));
        }
        return carsModel;
    }

    private CarsModel() {
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public List<Car> getCars(Integer count){
        return ((count != null) && ( count.intValue() > 0 && count.intValue() < 5)) ? cars.subList(0, count) : cars;
    }
}
