package com.pgk.task.service;

import com.pgk.task.dao.CityDao;
import com.pgk.task.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService{

    @Autowired
    CityDao cityDao;

    @Override
    public List<City>listCity() {
        List<City>  cities = cityDao.listCity();
        return cities;
    }

    @Override
    public List<City> getListCityByCountryId(int id) {
        List<City> cities = cityDao.getListCityByCountryId(id);
        return cities;
    }

    @Override
    public List<City> getListCityByCountryName(String name) {
        List<City> cities = cityDao.getListCityByCountryName(name);
        return cities;
    }
}
