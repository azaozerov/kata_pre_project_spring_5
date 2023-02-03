package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> cars = new ArrayList<>();
    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars(Integer count) {
        return ((count != null) && (count > 0 && count < 5)) ? cars.subList(0, count) : cars;
    }
}
