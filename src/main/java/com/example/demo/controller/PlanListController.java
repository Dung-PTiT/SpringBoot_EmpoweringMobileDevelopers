package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanListController {

    @GetMapping("/displayPlanList")
    public String displayPlanList(){
        return "planList";
    }
}
