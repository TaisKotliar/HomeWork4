package ua.org.oa.TaisKotliar;

import java.util.Calendar;

public class Auto extends Property {
    /**
     * Car model
     */
    private String model;
    /**
     * Minimum price
     */
    private int basicPrice = 50000;
    /**
     * Mileage of thr car
     */
    private int mileage;
    /**
     * Year of Issue thr car
     */
    private int yearOfIssue;

    public Auto(String nameOwner, String surnameOwner, String model, int mileage, int yearOfIssue) {
        super.nameOwner = nameOwner;
        super.surnameOwner = surnameOwner;
        this.model = model;
        this.mileage = mileage;
        this.yearOfIssue = yearOfIssue;
    }
    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }
    @Override
    public double calculationPrice() {
        double priceForSale1 = basicPrice - mileage * 0.01;
        if (yearOfIssue > 2010) {
            priceForSale = priceForSale1 * 1.5;
        } else {
            priceForSale = priceForSale1 * 0.9;
        }
        return priceForSale;
    }

    @Override
    public void info() {
        getClass().toString();
        System.out.println("Name: " + nameOwner);
        System.out.println("Surname: " + surnameOwner);
        System.out.println("Car model: " + model);
        System.out.println("Price for sale: " + priceForSale);
    }

}
