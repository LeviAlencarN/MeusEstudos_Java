package devices;

public class DeviceScanner extends Device implements Scanner{
    public DeviceScanner(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan(){
        return "Scannerd content";
    }
    
}
