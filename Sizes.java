package AssembleComputer;

//size data only for the Case
public class Sizes {
  private double width;
  private double height;
  private double depth;

  /**
   * Width
   * 9.06 in. (230.12 mm)
   * Depth
   * 18.90 in. (480.00 mm)
   * Height
   * 19.88 in. (505.00 mm)
   */
  public Sizes(){
      this(9,19,18);
  }

  public Sizes(double w, double h, double d){
      this.width = w;
      this.height = h;
      this.depth = d;
  }

  public double getWidth() {
      return width;
  }

  public void setWidth(double width) {
      this.width = width;
  }

  public double getHeight() {
      return height;
  }

  public void setHeight(double height) {
      this.height = height;
  }

  public double getDepth() {
      return depth;
  }

  public void setDepth(double depth) {
      this.depth = depth;
  }

  @Override
  public String toString(){
      return "\nCase Size: " + width + " X " + height + " X " + depth + "\n";
  }
}