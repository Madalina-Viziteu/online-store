package project.service;
import project.model.*;
import project.repository.Item;

import java.util.ArrayList;
import java.util.List;


public class BouquetService {

    public Double flowersPrice(List<Flower> flowerList) {
            Double bouquetPrice = 0.0;
            for (Flower flower : flowerList) {
                bouquetPrice = bouquetPrice + flower.getPrice();
            }
            return bouquetPrice;
        }


    public Double totalPrice (Double bouquetPrice, Double packagePrice) {
        return bouquetPrice + packagePrice;
    }
}


