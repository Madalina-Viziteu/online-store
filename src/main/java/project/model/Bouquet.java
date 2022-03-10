package project.model;

import java.util.List;

public class Bouquet {

    private List<Flower> flowers;
    private Package aPackage;
    private Double price;

    public Bouquet() {
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
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
                ", aPackage=" + aPackage +
                '}';
    }

}
