package Chapter_1.AccessModifires.Devices;

/**
 * Created by MaxiM on 07.11.2015.
 */
public abstract class PackageBaseDevice extends BaseDevice {

    public String className = "Abstract Package Base Device - ";

    @Override
    public String getClassName() {
        return className;
    }

    private void privatePackageBaseDeviceMethod() {
        printMethodMessage(privateName, false);
    }

    void defaultPackageBaseDeviceMethod() {
       printMethodMessage(defaultName, false);
    }

    protected void protectedPackageBaseDeviceMethod() {
        printMethodMessage(protectedName, false);
    }

    public void publicPackageBaseDeviceMethod() {
        printMethodMessage(publlicName, false);
    }

    @Override
    void defaultAbstractBaseDeviceMethod() {
        printMethodMessage(defaultName, true);
    }

    abstract void defaultAbstractPackageBaseDeviceMethod();

    protected abstract void protectedAbstractPackageBaseDeviceMethod();

    public abstract void publicAbstractPackageBaseDeviceMethod();
}
