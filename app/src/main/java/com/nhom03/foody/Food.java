package com.nhom03.foody;

public class Food {
    private int fId;
    private String fName;
    private int fPrice;

    public Food(int fId, String fName, int fPrice) {
        this.fId = fId;
        this.fName = fName;
        this.fPrice = fPrice;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getfPrice() {
        return fPrice;
    }

    public void setfPrice(int fPrice) {
        this.fPrice = fPrice;
    }
}
