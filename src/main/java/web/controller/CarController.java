package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
private CarService carService;


    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "countCars", defaultValue = "5") Integer count, Model model) {
        if (count > 5) {
            count = 5;
        }
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
