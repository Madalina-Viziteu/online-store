package project.repository;

import project.model.Bouquet;
import project.model.Flower;

import java.util.List;

public interface Item {

   void addToCart(Bouquet bouquet);
   void removeFromCart(Bouquet bouquet);
   Double totalPrice(List<Flower> flowerList);

}
