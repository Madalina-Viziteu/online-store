package project.service;

import project.model.Bouquet;
import project.repository.Item;


import java.util.ArrayList;
import java.util.List;

public class BasketService implements Item {

    public List<Bouquet> addToCart(Bouquet bouquet) {
        List<Bouquet> bouquetList = new ArrayList<>();
        bouquet.setFlowers(bouquet.getFlowers());
        bouquet.setaPackage(bouquet.getaPackage());
        bouquet.setPrice(bouquet.getPrice());

        bouquetList.add(bouquet);
        return bouquetList;

    }

    public List<Bouquet> removeFromCart(Bouquet bouquet) {
        List<Bouquet> bouquetList = new ArrayList<>();
        bouquet.getFlowers();
        bouquet.getaPackage();
        bouquet.getPrice();

        bouquetList.remove(bouquet);
        return bouquetList;
    }

//    public Double totalPrice(Double packagePrice, Double bouquetPrice) {
//
//        return packagePrice + bouquetPrice;
//    }

    public Double basketPrice(List<Bouquet> bouquetList) {
        BouquetService service = new BouquetService();
        double price = 0.0;
        for (Bouquet boquete : bouquetList) {
            price = service.totalPrice(boquete.getPrice(), boquete.getaPackage().getPrice());
            //price = price + boquete.getPrice()+ boquete.getaPackage().getPrice();
        }
        return price;
    }
}

