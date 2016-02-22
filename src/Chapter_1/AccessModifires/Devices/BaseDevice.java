package Chapter_1.AccessModifires.Devices;

/**
 * Created by MaxiM on 07.11.2015.
 */

abstract class BaseDevice {

    public String className = "Abstract Base Device - ";
    public final String method = " method";
    public final String abstractMethod = " abstract method";

    public final String privateName = "private";
    public final String defaultName = "default";
    public final String protectedName = "protected";
    public final String publlicName = "public";

    public String getClassName() {
        return className;
    }

    private void privateBaseDeviceMethod() {
        printMethodMessage(privateName, false);
    }

    void defaultBaseDeviceMethod() {
       printMethodMessage(defaultName, false);
    }

    protected void protectedBaseDeviceMethod() {
        printMethodMessage(protectedName, false);
    }

    public void publicBaseDeviceMethod() {
        printMethodMessage(publlicName, false);
    }

    abstract void defaultAbstractBaseDeviceMethod();

    protected abstract void protectedAbstractBaseDeviceMethod();

    public abstract void publicAbstractBaseDeviceMethod();

    public void printMethodMessage(String string, boolean isAbstract) {
        String addAbstract = abstractMethod;
        if (!isAbstract) {
            addAbstract = method;
        }
        System.out.println(getClassName() + string + addAbstract);
    }
}
