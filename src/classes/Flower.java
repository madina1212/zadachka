package classes;

import enumes.Color;

public class Flower {
    private String manufacturerCountry;
    private int shelfLifeInDays;
    private Color color;
    private int price;

    public Flower(String manufacturerCountry, int shelfLifeInDays, Color color, int price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.color = color;
        this.price = price;
    }

    public Flower() {

    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(int shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "manufacturerCountry='" + manufacturerCountry + '\'' +
                ", shelfLifeInDays=" + shelfLifeInDays +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
