package project.model;

public class Orchid extends Flower{

    public Orchid() {
    }

    public Orchid(String name, Colour colour, Double price) {
        super(name, colour, price);
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }

    @Override
    public void setPrice(Double price) {
        this.setPrice(5.0);
    }
}
