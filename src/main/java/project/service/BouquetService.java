package project.service;

import project.model.*;
import project.repository.Item;

import java.util.List;

public class BouquetService implements Item {

    @Override
    public void addToCart() {

    }

    @Override
    public void removeFromCart() {

    }

    public Double totalPrice(List<Flower> flowerList) {
        try {
            Double bouquetPrice = 0.0;
            for (Flower flower : flowerList) {
                bouquetPrice = bouquetPrice + flower.getPrice();
            }
            return bouquetPrice;
        } catch (NullPointerException exception) {
            System.out.println("Exception ");
        }
        return 0.0; // exceptie
    }
}


