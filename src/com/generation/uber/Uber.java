package com.generation.uber;

public class Uber {
    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currentMonthSalary = 0;

    //constructores
    void Uber(){}

    void Uber(String name, String carModel, String plate, int minimum, double ratePerKm, int ratePerMinute, int currentMonthSalary ){
        setName(name);
        setCarModel(carModel);
        setPlate(plate);
        setMinimum(minimum);
        setRatePerKm(ratePerKm);
        setRatePerMinute(ratePerMinute);
        setCurrentMonthSalary(currentMonthSalary);
    }

    //Métodos set y get para los atributos
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public double getRatePerKm() {
        return this.ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public int getRatePerMinute() {
        return this.ratePerMinute;
    }

    public void setRatePerMinute(int ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public int getCurrentMonthSalary() {
        return this.currentMonthSalary;
    }

    public void setCurrentMonthSalary(int currentMonthSalary) {
        this.currentMonthSalary = currentMonthSalary;
    }


    //Métodos de funcionalidad
    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,minimum);
    }
}
