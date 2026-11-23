package com.pluralsight.finance;

public class Jewelry extends FixedAsset implements Valuable {
    // Properties
    private double karat;

    // Constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue(){
        // Calculate value of jewelry from algorithm and return it.
        // For now, it just returns its original market value
        return super.getValue();
    }

    // Getters & Setters
    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}
