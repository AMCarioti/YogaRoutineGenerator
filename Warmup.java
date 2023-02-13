class Warmup extends YogaMove {
  static double duration = .5;
  
  public Warmup(String name){
    super(name);
    this.setLength(duration);
  }

  @Override
  public String toString(){
    return "Warmup for " + this.length + " minutes:\n" + this.name + "\n";
  }
}
