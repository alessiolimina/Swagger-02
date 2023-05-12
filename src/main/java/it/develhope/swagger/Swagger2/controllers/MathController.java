package it.develhope.swagger.Swagger2.controllers;

import io.swagger.v3.oas.models.security.SecurityScheme;
import it.develhope.swagger.Swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/")
    public String welcomeMathMsg(){
        return "Welcome to the math section";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation getDivisionInfo(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setName("Division");
        arithmeticOperation.setMinNumberOfOperands(2);
        arithmeticOperation.setDescription("The process of calculating the number of times one number is contained within another");
        arithmeticOperation.setProperties(new String[]{"Dividend", "Divisor", "Quotient", "Remainder"});
        return arithmeticOperation;
    }

    @GetMapping("/multiplication")
    public Integer getMultiplication(@RequestParam Integer multiplier, @RequestParam Integer multiplicand){
        return multiplier * multiplicand;
    }

    @GetMapping("/square/{n}")
    public Integer getSquare(@PathVariable Integer n){
        return n * n;
    }
}
//Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93ecwAfQ