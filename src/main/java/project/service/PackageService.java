package project.service;

import project.model.Pack;


public class PackageService {

    public Double getPackagePrice(Pack aPack) {
        return aPack.getPrice();
    }
}
