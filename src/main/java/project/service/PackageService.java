package project.service;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import project.model.Box;
import project.model.Jar;
import project.model.Package;

import java.util.List;

public class PackageService {

    public Double getPackagePrice(Package aPackage) {
        return aPackage.getPrice();
    }
}
