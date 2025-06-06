package com.example.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {

    @GetMapping("/")
    public String calc(@RequestParam(name = "operand1", required = false) Integer operand1,
                       @RequestParam(name = "operation", required = false) String operation,
                       @RequestParam(name = "operand2", required = false) Integer operand2,
                       Model model) {
        
        int result = 0;

        if (operand1 != null && operation != null && operand2 != null) {
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        result = 0; // handle division by zero
                    }
                    break;
                default:
                    break;
            }
        }

        model.addAttribute("operand1", operand1);
        model.addAttribute("operation", operation);
        model.addAttribute("operand2", operand2);
        model.addAttribute("result", result);

        return "calc";
    }

    
}