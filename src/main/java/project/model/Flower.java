package project.model;

public class Flower {

    private String name;
    private Colour colour;
    private Double price;

    public Flower() {
    }

    public Flower(String name, Colour colour, Double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name +
                " of colour " + colour;
    }
}
