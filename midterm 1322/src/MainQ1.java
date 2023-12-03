public class MainQ1 {
    public static void main(String[] args) {
        Bulb bulb = new Bulb("GE", "Smart Bulb", 1);
        bulb.increaseBrightness(50);
        bulb.printStatus();
    }
}