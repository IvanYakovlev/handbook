package com.pgk.task.controller;

import com.pgk.task.model.City;
import com.pgk.task.model.Country;
import com.pgk.task.service.CityService;
import com.pgk.task.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    @Qualifier("cityService")
    CityService cityService;

    @Autowired
    @Qualifier("countryService")
    CountryService countryService;

    @RequestMapping(value = "/showByCountry", method = RequestMethod.GET, produces = "application/json; text/UTF-8")
    public ResponseEntity<List<City>> showByCountry(@RequestParam(value = "id") Integer id ){
        List<City> list = cityService.getListCityByCountryId(id);
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "/listCountry", method = RequestMethod.GET, produces = "application/json; text/UTF-8")
    public ResponseEntity<List<Country>> showByCountry( ){
        List<Country> list = countryService.listCountry();
        return ResponseEntity.ok(list);
    }

}