package application;

import devices.ComboDevice;
import devices.DevicePrinter;
import devices.DeviceScanner;

public class App {
    public static void main(String[] args) throws Exception {
        DevicePrinter printer = new DevicePrinter("502");
        printer.print("Curriculo latter");
        printer.processDoc("Curriculo latter");

        DeviceScanner scanner = new DeviceScanner("2342");
        scanner.processDoc("My email");
        System.out.println("Scan result: " + scanner.scan());

        ComboDevice c = new ComboDevice("1506");
        c.processDoc("Artigo");
        c.print("Artigo");
        System.out.println("Combo Scan result: " + c.scan());
    }
}
