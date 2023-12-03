public class Bulb extends SmartDevice implements ISmartBulb {
    private int brightness;
    public Bulb(String manufacturer, String model, int version) {
        super(manufacturer, model, version);
        brightness = 0;
    }

    @Override
    public void turnOn() {
        brightness = 100;
    }

    @Override
    public void turnOff() {
        brightness = 0;
    }

    @Override
    public void increaseBrightness(int percentage) {
        brightness += percentage;
        if (brightness > 100) {
            brightness = 100;
        }
    }

    @Override
    public void decreaseBrightness(int percentage) {
        brightness -= percentage;
        if (brightness < 0) {
            brightness = 0;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Model: " + getModel());
        System.out.println("Version: " + getVersion());
        System.out.println("Brightness: " + brightness);
    }
}
