package web.controller;

import model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        CarsModel cars = CarsModel.getCarsModel();

        model.addAttribute("cars", cars.getCars(count));
        return "cars";
    }
}
