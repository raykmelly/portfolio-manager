package com.pluralsight.finance;

public class House extends FixedAsset implements Valuable{
    // Properties
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // Constructor
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // Methods
    @Override
    public double getValue() {
        // Calculate the real value of the house with formula not given
        // For now just returns the market value of the asset.
        return super.getValue();
    }

    // Getters & Setters
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
}
