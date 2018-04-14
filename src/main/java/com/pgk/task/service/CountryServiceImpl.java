package com.pgk.task.service;

import com.pgk.task.dao.CountryDao;
import com.pgk.task.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryDao countryDao;

    @Override
    public List<Country> listCountry() {
        List<Country> list = countryDao.listCountry();
        return list;
    }
}
