package project.model;

public class Rose extends Flower {

    public Rose() {
    }

    public Rose(String name, Colour colour, Double price) {
        super(name, colour, price);
    }

    @Override
    public Double getPrice() {
        return 6.5;
    }

    @Override
    public void setPrice(Double price) {
        this.setPrice(2.5);
    }

}
