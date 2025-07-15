package com.data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex3Controller {
    @GetMapping("/ex3")
    public String ex3() {
        return "ex3";
    }
    @PostMapping("/calculate")
    public String ex3(
            @RequestParam("number1") double number1,
            @RequestParam("number2") double number2,
            @RequestParam("operator") String operator,
            Model model) {
        double result = 0;
        String error = null;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    error = "You don’t divide for 0";
                }else {
                    result = number1 / number2;
                }
                break;
            default:
                error = "Invalid operator";
                break;
        }
        if(error != null) {
            model.addAttribute("error", error);
        }else {
            model.addAttribute("number1", number1);
            model.addAttribute("number2", number2);
            model.addAttribute("operator", operator);
            model.addAttribute("result", result);
        }
        return "resultForEx3";
    }
}
