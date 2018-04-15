package com.pgk.task.service;

import com.pgk.task.model.City;

import java.util.List;

public interface CityService {
    List<City> listCity();
    List<City> getListCityByCountryId(int id);
}
