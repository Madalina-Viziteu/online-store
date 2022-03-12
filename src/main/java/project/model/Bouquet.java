package project.model;

import java.util.List;

public class Bouquet {

    private List<Flower> flowers;
    private Pack aPack;
    private Double price;

    public Bouquet() {
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Pack getaPackage() {
        return aPack;
    }

    public void setaPackage(Pack aPack) {
        this.aPack = aPack;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", aPackage=" + aPack +
                '}';
    }

}
