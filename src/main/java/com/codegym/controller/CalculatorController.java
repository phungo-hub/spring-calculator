package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showCalculator() {
        return "index";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam double value1, @RequestParam double value2,
                            @RequestParam String[] operator, Model model) {
        double result = 0;
        for (String o: operator) {
            if (o.equals("+"))
                result = value1 + value2;
            else if (o.equals("-"))
                result = value1 - value2;
            else if (o.equals("x"))
                result = value1 * value2;
            else
                result = value1 / value2;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
