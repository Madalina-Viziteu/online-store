package project.model;

public class Pack {

    private Colour colour;
    private Double price;

    public Pack() {
    }

    public Pack(Colour colour, Double price) {
        this.colour = colour;
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Package have" +
                " colour " + colour;
    }
}
