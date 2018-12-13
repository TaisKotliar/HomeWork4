package ua.org.oa.TaisKotliar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Property> report = new ArrayList<>();

        Flat flat1 = new Flat("Lu", "Markov", "New-York", 55.9, 1, 5);
        Flat flat2 = new Flat("James", "Rolov", "London", 100.7, 3, 14);
        Flat flat3 = new Flat("Frodo", "Mordorov", "Kyoto", 200.4, 5, 1);
        Auto auto1 = new Auto("Sui", "Perlov", "Charry 287", 170000, 1800);
        Auto auto2 = new Auto("Lars", "Karlov", "Opel9", 110000, 2012);
        Auto auto3 = new Auto("Amarula", "Jameson", "Ravon64", 90000, 2000);
        Share share1 = new Share("Tom", "Portman", 10, 205, "Alfa bank");
        Share share2 = new Share("Mila", "Nova", 805, 25, "Bank Military");
        Share share3 = new Share("Sauron", "White", 1550, 43, "Bank");

        auto3.setBasicPrice(10000);

        report.add(flat1);
        report.add(flat2);
        report.add(flat3);
        report.add(auto1);
        report.add(auto2);
        report.add(auto3);
        report.add(share1);
        report.add(share2);
        report.add(share3);

        for (Property thisProperty : report) {
            System.out.println(thisProperty.getClass().getSimpleName());
            thisProperty.calculationPrice();
            thisProperty.info();
            System.out.println();
        }
    }
}
