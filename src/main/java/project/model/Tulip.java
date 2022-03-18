package project.model;

public class Tulip extends Flower{

    public Tulip() {
    }

    public Tulip(String name, Colour colour, Double price) {
        super(name, colour, price);
    }

    @Override
    public Double getPrice() {
        return 3.2;
    }

    @Override
    public void setPrice(Double price) {
        this.setPrice(3.2);
    }
}
