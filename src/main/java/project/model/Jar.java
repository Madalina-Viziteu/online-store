package project.model;

public class Jar extends Pack {

    public Jar() {
    }

    public Jar(Colour colour, Double price) {
        super(colour, price);
    }

    @Override
    public Double getPrice() {
        return 7.0;
    }

    @Override
    public void setPrice(Double price) {
        this.setPrice(7.0);
    }
}
