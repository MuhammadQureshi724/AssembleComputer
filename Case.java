package AssembleComputer;

/**
 * Width
 * 9.06 in. (230.12 mm)
 * Depth
 * 18.90 in. (480.00 mm)
 * Height
 * 19.88 in. (505.00 mm)
 */
public class Case {
    private String manufacturer;
    private Sizes size;
    private String color;

    public Case(String manufacturer, Sizes size, String color) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.color = color;
    }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public Sizes getSize() { return size; }
    public void setSize(Sizes size) { this.size = size; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "\nCase: " + manufacturer + ", Size: " + size + ", Color: " + color;
    }
}
