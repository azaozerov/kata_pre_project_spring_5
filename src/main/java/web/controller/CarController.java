package web.controller;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    CarService carService;
    @Autowired
    CarController(CarService carService) {
        this.carService = carService;
    };
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5", required = false) Integer count) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
