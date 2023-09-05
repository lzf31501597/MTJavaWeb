package com.javaTest.houseRentSystem.domain;

public class House {
    private int houseNuM;
    private String name;
    private String telnumber;
    private String adress;
    private double monthRent;
    private String statusHouse;

    public House(int houseNuM, String name, String telnumber, String adress, double monthRent, String statusHouse) {
        this.houseNuM = houseNuM;
        this.name = name;
        this.telnumber = telnumber;
        this.adress = adress;
        this.monthRent = monthRent;
        this.statusHouse = statusHouse;
    }


    public int getHouseNuM() {
        return houseNuM;
    }

    public void setHouseNuM(int houseNuM) {
        this.houseNuM = houseNuM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(double monthRent) {
        this.monthRent = monthRent;
    }

    public String getStatusHouse() {
        return statusHouse;
    }

    public void setStatusHouse(String statusHouse) {
        this.statusHouse = statusHouse;
    }

    @Override
    public String toString(){

        return houseNuM +
                "\t\t" + name +
                "\t" + telnumber +
                "\t\t" + adress +
                "\t" + monthRent +
                "\t" + statusHouse;
    }

}
