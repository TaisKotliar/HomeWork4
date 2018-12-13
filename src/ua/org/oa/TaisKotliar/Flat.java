package ua.org.oa.TaisKotliar;

public class Flat extends Property {
    /**
     * Adress of the flat
     */
    private String adress;
    /**
     * Sqare of the flat
     */
    private double square;
    /**
     * Room quantity in the flat
     */
    private int roomQuantity;
    /**
     * Flor number
     */
    private int flor;
    /**
     * Basic price for 1 square meter
     */
    int priseForMeter = 1000;

    public Flat(String nameOwner, String surnameOwner, String adress, double square, int roomQuantity, int flor) {
        super.nameOwner = nameOwner;
        super.surnameOwner = surnameOwner;
        this.square = square;
        this.roomQuantity = roomQuantity;
        this.flor = flor;
        this.adress = adress;
    }

    @Override
    public double calculationPrice() {
        double priceForSale1 = square * priseForMeter;
        if (flor > 5) {
            priceForSale = priceForSale1 * 1.5;
        } else if (flor > 1 && flor <= 5) {
            priceForSale = priceForSale1 * 1.1;
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
        System.out.println("Adress: " + adress);
        System.out.println("Room quantity: " + roomQuantity);
        System.out.println("Square of the flat: " + square);
        System.out.println("Price for sale: " + priceForSale);
    }
}

