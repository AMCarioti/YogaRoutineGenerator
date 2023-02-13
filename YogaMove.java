abstract class YogaMove {
  protected String name;
  protected double length;

  public YogaMove(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setLength(double newLength){
    length = newLength;
  }
}
