package AssembleComputer;

public class Motherboard {
	private String manufacturer;
    private String model;
    private int ramSlots;

    public Motherboard(String manufacturer, String model, int ramSlots) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
    }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getRamSlots() { return ramSlots; }
    public void setRamSlots(int ramSlots) { this.ramSlots = ramSlots; }

    @Override
    public String toString() {
        return "\nMotherboard: " + manufacturer + " " + model + ", RAM slots: " + ramSlots;
    }
}

