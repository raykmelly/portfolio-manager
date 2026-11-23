package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable{
    // Properties
    private String name;
    private double marketValue;

    // Constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // Methods
    @Override
    public double getValue() {
        return marketValue;
    }
}
