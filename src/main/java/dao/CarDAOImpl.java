package dao;

import model.Car;
import model.CarsModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{
    CarsModel carsModel = CarsModel.getCarsModel();
    @Override
    public void addCar(Car car) {
        carsModel.addCar(car);
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carsModel.getCars(count);
    }
}
