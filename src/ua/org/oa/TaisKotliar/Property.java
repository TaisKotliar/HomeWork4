package ua.org.oa.TaisKotliar;

public abstract class Property {
    protected String nameOwner;
    protected String surnameOwner;
    protected double priceForSale;

    public abstract double calculationPrice();

    public abstract void info();
}
