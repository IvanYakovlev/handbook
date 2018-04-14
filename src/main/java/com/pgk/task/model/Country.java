package com.pgk.task.model;




public class Country {

    private String idCountry;
    private String nameCountry;

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "idCountry='" + idCountry + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                '}';
    }
}
