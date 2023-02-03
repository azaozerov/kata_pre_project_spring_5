package model;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    List<Car> getCars(Integer count);
}
