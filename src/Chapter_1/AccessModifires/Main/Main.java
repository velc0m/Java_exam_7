package Chapter_1.AccessModifires.Main;

import Chapter_1.AccessModifires.Devices.PackageBaseDeviceConcrete;

/**
 * Created by MaxiM on 07.11.2015.
 */

public class Main {

    public static void main(String[] args) {

        PackageBaseDeviceConcrete packageBaseDeviceConcrete = new PackageBaseDeviceConcrete();

        packageBaseDeviceConcrete.publicBaseDeviceMethod();
        packageBaseDeviceConcrete.publicPackageBaseDeviceMethod();
        packageBaseDeviceConcrete.publicAbstractBaseDeviceMethod();
        packageBaseDeviceConcrete.publicAbstractPackageBaseDeviceMethod();
    }
}
