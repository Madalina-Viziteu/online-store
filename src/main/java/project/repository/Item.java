package project.repository;

import project.model.Bouquet;

import java.util.List;

public interface Item {

   List<Bouquet> addToCart(Bouquet bouquet);
   List<Bouquet> removeFromCart(Bouquet bouquet);
   Double basketPrice(List<Bouquet> bouquetList);

}
