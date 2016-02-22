package Chapter_1.AccessModifires.Devices;

/**
 * Created by MaxiM on 07.11.2015.
 */
public class PackageBaseDeviceConcrete extends PackageBaseDevice {

    public String className = "Package Base Device Concrete - ";

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    protected void protectedAbstractPackageBaseDeviceMethod() {
        printMethodMessage(protectedName, true);
    }

    @Override
    void defaultAbstractPackageBaseDeviceMethod() {
        printMethodMessage(defaultName, true);
    }

    @Override
    public void publicAbstractPackageBaseDeviceMethod() {
        printMethodMessage(publlicName, true);
    }

    @Override
    protected void protectedAbstractBaseDeviceMethod() {
        printMethodMessage(protectedName, true);
    }

    @Override
    public void publicAbstractBaseDeviceMethod() {
        printMethodMessage(publlicName, true);
    }

    @Override
    void defaultPackageBaseDeviceMethod() {
        super.defaultPackageBaseDeviceMethod();
    }
}
