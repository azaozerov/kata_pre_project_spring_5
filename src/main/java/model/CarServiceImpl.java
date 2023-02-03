package model;

import dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;
    @Override
    public void addCar(Car car) {
        carDAO.addCar(car);
    }
    @Override
    public List<Car> getCars(Integer count) {
        return carDAO.getCars(count);
    }

    @PostConstruct
    public void doInit(){
        carDAO.addCar(new Car("ЗИЛ", "34 56 шо", "Иван" ));
        carDAO.addCar(new Car("Волга", "а821ое77", "Сергей" ));
        carDAO.addCar(new Car("Москвич", "12 98 ае", "Митрофан" ));
        carDAO.addCar(new Car("Mercedes", "с050рм177", "Кирилл" ));
        carDAO.addCar(new Car("Трактор", "е937ео159", "Петр" ));
    }
}
