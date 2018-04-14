package com.pgk.task.dao;

import com.pgk.task.model.City;
import com.pgk.task.model.Country;
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
public class CountryDaoImplmpl extends JdbcDaoSupport implements CountryDao {

    @Qualifier("dataSource")
    @Autowired
    DataSource dataSource;

    @PostConstruct
    public void initialize(){
        setDataSource(dataSource);
    }

    @Override
    public List<Country> listCountry() {
        String sql = "SELECT * FROM countries";
        List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Country> result = new ArrayList<Country>();
        for (Map<String,Object> row: rows){
            Country country = new Country();
            country.setIdCountry(String.valueOf((row.get("country_id"))));
            country.setNameCountry((String) row.get("country_name"));
            result.add(country);
        }
        return result;

    }
}
