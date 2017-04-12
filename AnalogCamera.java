class AnalogCamera implements Printable{
  String details;

  public AnalogCamera(){
    this.details = "This is an Analog Camera";
  }

  public String printDetails(){
    System.out.println(this.details);
    return this.details;
  }

}
