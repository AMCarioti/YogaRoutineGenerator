class Cooldown extends YogaMove {
  static double duration = 1;
  
  public Cooldown(String name){
    super(name);
    this.setLength(duration);
  }

  @Override
  public String toString(){
    return "Cooldown for " + this.length + " minutes:\n" + this.name + "\n";
  }
}
