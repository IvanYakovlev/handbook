package com.pgk.task.dao;

import com.pgk.task.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CityDaoImpl extends JdbcDaoSupport implements CityDao {


    @Qualifier("dataSource")
    @Autowired
    DataSource dataSource;

    @PostConstruct
    protected void initialize(){
        setDataSource(dataSource);
    }

    @Override
    public List<City> listCity() {
        String sql = "SELECT * FROM cities";
        List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql);

        List<City> result = new ArrayList<City>();
        buildList(rows, result);
        return result;
    }

    @Override
    public List<City> getListCityByCountryId(int id) {
        String sql = "SELECT * FROM cities WHERE country_id='"+id+"'";
        List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql);

        List<City> result = new ArrayList<City>();
        buildList(rows, result);
        return result;

    }

    @Override
    public List<City> getListCityByCountryName(String name) {
        String sql = "SELECT * FROM cities WHERE country_name='"+name+"'";
        List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql);

        List<City> result = new ArrayList<City>();
        buildList(rows, result);
        return result;
    }

    private void buildList(List<Map<String, Object>> rows, List<City> result) {
        for (Map<String,Object> row: rows){
            City city = new City();
            city.setIdCity(String.valueOf((row.get("city_id"))));
            city.setNameCity((String) row.get("city_name"));
            city.setIdCountry(String.valueOf((row.get("country_id"))));
            result.add(city);
        }
    }
}

