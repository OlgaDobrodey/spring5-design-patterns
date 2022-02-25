package com.itrex.springbootmvc.controller;

import com.itrex.springbootmvc.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @GetMapping("/person")
    public ModelAndView showForm() {
        return new ModelAndView("personHome", "person", new Person(1, "Olga", "Minsk"));
    }

    @PostMapping(value = "/person")
    public String submit(@RequestBody Person person,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute("errorMessage", result.getAllErrors().toString());
            return "error";
        }
        model.addAttribute("name", person.getName());
        model.addAttribute("address", person.getAddress());
        model.addAttribute("id", person.getId());
        return "personView";
    }

    @PutMapping(value = "/person")
    public String update(@RequestBody Person person,
                         BindingResult result, ModelMap model) {
        //we have to change person in dataBase
        if (result.hasErrors()) {
            model.addAttribute("errorMessage", result.getAllErrors().toString());
            return "error";
        }
        model.addAttribute("name", person.getName());
        model.addAttribute("address", person.getAddress());
        model.addAttribute("id", person.getId());
        return "personView";
    }

}
