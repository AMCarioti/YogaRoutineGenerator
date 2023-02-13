class Stretch extends YogaMove {
  static double duration = 1.25;
  
  public Stretch(String name){
    super(name);
    this.setLength(duration);
  }

  @Override
  public String toString(){
    return "Stretch for " + this.length + " minutes:\n" + this.name + "\n";
  }
}
