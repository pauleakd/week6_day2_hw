class DigitalCamera implements Printable{
  String details;

  public DigitalCamera(){
    this.details = "This is a Digital Camera";
  }

  public String printDetails(){
    System.out.println(this.details);
    return this.details;
  }
}
