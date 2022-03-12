package project;

import project.model.*;
import project.model.Package;
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
        Package pack = new Package();

        List<Flower> flowerList = new ArrayList<>();
        flowerList.add(new Rose("Rose", Colour.RED, flower.getPrice()));
        flowerList.add(new Orchid("Orchid", Colour.WHITE, flower.getPrice()));
        flowerList.add(new Tulip("Tulip", Colour.YELLOW, flower.getPrice()));

        bouquet.setFlowers(flowerList);
        bouquet.setaPackage(new Jar(Colour.WHITE, pack.getPrice()));

        System.out.println("The flowers in the bouquet: " + flowerService.prepareBouquet(bouquet.getFlowers()));
        System.out.println("The price of the bouquet: " + bouquetService.totalPrice(flowerList) + " RON");
        System.out.println("The package you choose: " + bouquet.getaPackage());
        System.out.println("The price of the package: " + packageService.getPackagePrice(bouquet.getaPackage()) + " RON");

        double packagePrice = packageService.getPackagePrice(bouquet.getaPackage());
        double bouquetPrice = bouquetService.totalPrice(flowerList);
        System.out.println("The total cost is: ");
        System.out.println(basketService.totalPrice(packagePrice, bouquetPrice) + " RON");

    }
}
