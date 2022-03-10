package project.model;

public class Box extends Package{

    public Box() {
    }

    public Box(Colour colour, Double price) {
        super(colour, price);
    }

    @Override
    public Double getPrice() {
        return 4.0;
    }

    @Override
    public void setPrice(Double price) {
        this.setPrice(4.0);
    }
}
