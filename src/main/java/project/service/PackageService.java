package project.service;

import project.model.Package;


public class PackageService {

    public Double getPackagePrice(Package aPackage) {
        return aPackage.getPrice();
    }
}
