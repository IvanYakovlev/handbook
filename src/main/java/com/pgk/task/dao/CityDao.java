package com.pgk.task.dao;

import com.pgk.task.model.City;

import java.util.List;

public interface CityDao {
    public List<City> listCity();
    public List<City> getListCityByCountryId(int id);

}
