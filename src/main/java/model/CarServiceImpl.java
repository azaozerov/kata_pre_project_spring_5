package model;

import dao.CarDAO;
import dao.CarDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO; // = new CarDAOImpl();
    @Override
    public void addCar(Car car) {
        carDAO.addCar(car);
    }
    @Override
    public List<Car> getCars(Integer count) {
        return carDAO.getCars(count);
    }
}
