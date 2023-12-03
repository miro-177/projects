public abstract class SmartDevice {
    private String manufacturer;
    private String model;
    private int version;
    public SmartDevice(){
        manufacturer = "Unknown";
        model = "Unknown";
        version = 1;
    }
    public SmartDevice(String manufacturer, String model, int version){
        this.manufacturer = manufacturer;
        this.model = model;
        this.version = version;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getVersion(){
        return version;
    }
    public abstract void printStatus();
}
