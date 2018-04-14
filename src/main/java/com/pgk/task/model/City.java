package com.pgk.task.model;



public class City {

    private String idCity;
    private String nameCity;
    private String idCountry;


    public City() {
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity='" + idCity + '\'' +
                ", nameCity='" + nameCity + '\'' +
                ", idCountry='" + idCountry + '\'' +
                '}';
    }
}
