package project.service;

public class BasketService {

    public Double totalPrice(Double packagePrice, Double bouquetPrice) {

        return packagePrice + bouquetPrice;
    }
}
