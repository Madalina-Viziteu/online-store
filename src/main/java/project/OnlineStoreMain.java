package project;

import project.model.*;
import project.model.Pack;
import project.service.BasketService;
import project.service.BouquetService;
import project.service.FlowerService;
import project.service.PackageService;

import java.util.ArrayList;
import java.util.List;

public class OnlineStoreMain {

    public static void main(String[] args) {

        FlowerService flowerService = new FlowerService();
        PackageService packageService = new PackageService();
        BouquetService bouquetService = new BouquetService();
        BasketService basketService = new BasketService();
        Bouquet bouquet = new Bouquet();
        Flower flower = new Flower();
        Pack pack = new Pack();
        Basket basket = new Basket();

        List<Flower> flowerList = new ArrayList<>();
        flowerList.add(new Rose("Rose", Colour.RED, flower.getPrice()));
        flowerList.add(new Orchid("Orchid", Colour.WHITE, flower.getPrice()));
        flowerList.add(new Tulip("Tulip", Colour.YELLOW, flower.getPrice()));

        bouquet.setFlowers(flowerList);
        bouquet.setaPackage(new Jar(Colour.WHITE, pack.getPrice()));

        System.out.println("The flowers in the bouquet: " + flowerService.prepareBouquet(bouquet.getFlowers()));
        System.out.println("The price of the bouquet: " + bouquetService.flowersPrice(flowerList) + " RON");
        System.out.println("The package you choose: " + bouquet.getaPackage());
        System.out.println("The price of the package: " + packageService.getPackagePrice(bouquet.getaPackage()) + " RON");

        // double packagePrice = packageService.getPackagePrice(bouquet.getaPackage());
        double packagePrice = packageService.getPackagePrice(bouquet.getaPackage());
        double bouquetPrice = bouquetService.flowersPrice(flowerList);

        //calculate the total cost
        System.out.println("The total cost fot this bouquet is: ");
        System.out.println(bouquetService.totalPrice(packagePrice, bouquetPrice));

        //add item in the basket
        System.out.println("The items added in the basket: ");
        basket.setBouquetList(basketService.addToCart(bouquet));
        System.out.println(basket.getBouquetList());

        System.out.println("----------------------");


        System.out.println("Making the second bouquet ");
        List<Flower> flowerList2 = new ArrayList<>();
        flowerList2.add(new Tulip("tulip1", Colour.RED, flower.getPrice()));
        flowerList2.add(new Tulip("tulip2", Colour.WHITE, flower.getPrice()));

        Bouquet bouquet2 = new Bouquet();
        bouquet2.setFlowers(flowerList2);
        bouquet2.setaPackage(new Box(Colour.RED, pack.getPrice()));

        System.out.println("The flowers in the bouquet: " + flowerService.prepareBouquet(bouquet2.getFlowers()));
        System.out.println("The price of the bouquet: " + bouquetService.flowersPrice(flowerList2) + " RON");
        System.out.println("The package you choose: " + bouquet2.getaPackage());
        System.out.println("The price of the package: " + packageService.getPackagePrice(bouquet2.getaPackage()) + " RON");

        System.out.println("The price of second bouquete: ");
        double packagePrice2 = packageService.getPackagePrice(bouquet2.getaPackage());
        double bouquetPrice2 = bouquetService.flowersPrice(flowerList2);
        System.out.println(bouquetService.totalPrice(bouquetPrice2, packagePrice2));
        System.out.println("-------------------------");

        List<Bouquet> bouquetList = new ArrayList<>();
        bouquetList.add(bouquet);
        bouquetList.add(bouquet2);

        //adding the items to basket
        basketService.addToCart(bouquet);
        basketService.addToCart(bouquet2);
        //afisare lista de items din basket
        System.out.println("Your basket contains the following items: ");
        System.out.println(basketService.getBasketItems(bouquetList));

        System.out.println("Basket after remove the item: ");
        basketService.removeFromBasket(bouquet2);

        //calculate the total cost
        System.out.println("The total cost is: ");
        // System.out.println(basketService.basketPrice(bouquetList));
        System.out.println(packagePrice + bouquetPrice + packagePrice2 + bouquetPrice2);

    }
}
