class Strengthen extends YogaMove {
  static double duration = 1.5;
  
  public Strengthen(String name){
    super(name);
    this.setLength(duration);
  }

  @Override
  public String toString(){
    return "Strengthen for " + this.length + " minutes:\n" + this.name + "\n";
  }
}
