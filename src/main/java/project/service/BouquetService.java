package project.service;
import project.model.*;
import project.repository.Item;

import java.util.List;


public class BouquetService implements Item {

    @Override
    public void addToCart(Bouquet bouquet) {

    }

    @Override
    public void removeFromCart(Bouquet bouquet) {

    }

    public Double totalPrice(List<Flower> flowerList) {
            Double bouquetPrice = 0.0;
            for (Flower flower : flowerList) {
                bouquetPrice = bouquetPrice + flower.getPrice();
            }
            return bouquetPrice;
        }
}


