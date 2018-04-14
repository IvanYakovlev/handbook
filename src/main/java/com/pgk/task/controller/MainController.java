package com.pgk.task.controller;

import com.pgk.task.service.CityService;
import com.pgk.task.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    @Qualifier("cityService")
    CityService cityService;

    @Autowired
    @Qualifier("countryService")
    CountryService countryService;



    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String showCityByCountry(@RequestParam(value = "item", required = false) String item, Model model) {
        if (item!=null) {
            model.addAttribute("countries", countryService.listCountry());
            model.addAttribute("cities", cityService.getListCityByCountryId(Integer.parseInt(item)));
            return "index";
        }else {
            item="1";
            model.addAttribute("countries", countryService.listCountry());
            model.addAttribute("cities", cityService.getListCityByCountryId(Integer.parseInt(item)));
            return "index";
        }
    }

}