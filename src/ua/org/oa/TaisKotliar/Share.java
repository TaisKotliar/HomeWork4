package ua.org.oa.TaisKotliar;

public class Share extends Property {
    /**
     * current price of one share
     */
    private int stockPrice;
    /**
     * quantity of shire than one person own
     */
    private int quantity;
    /**
     * Name of bank, where the person storage his shares.
     */
    private String BankStorage;

    public Share(String nameOwner, String surnameOwner, int stockPrice, int quantity, String BankStorage) {
        super.nameOwner = nameOwner;
        super.surnameOwner = surnameOwner;
        this.stockPrice = stockPrice;
        this.quantity = quantity;
        this.BankStorage = BankStorage;
    }

    @Override
    public double calculationPrice() {
        priceForSale = stockPrice * quantity;
        return priceForSale;
    }

    @Override
    public void info() {
        getClass().toString();
        System.out.println("Name: " + nameOwner);
        System.out.println("Surname: " + surnameOwner);
        System.out.println("Price for sale: " + priceForSale);
    }
}
