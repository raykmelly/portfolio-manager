package com.pluralsight.finance;

public class Gold extends FixedAsset implements Valuable {
    // Properties
    private double weight;

    // Constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // Methods
    @Override
    public double getValue(){
        // Calculate the value of gold from its weight and return it
        // For now it just returns its market value
        return super.getValue();
    }

    // Getters & setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
