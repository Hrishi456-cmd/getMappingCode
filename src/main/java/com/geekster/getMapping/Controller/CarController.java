package com.geekster.getMapping.Controller;

import com.geekster.getMapping.MyObject.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    Car c;

    @GetMapping("colour")
    public String getCarColour()
    {
        return c.getColour();
    }



}
