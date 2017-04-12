import java.util.*;

public class Photographer{
  public ArrayList<Printable> printables;

  public Photographer(){
    this.printables = new ArrayList<Printable>();
  }

  public void addCamera(Printable camera){
    this.printables.add(camera);
  }

  public void removeCamera(Printable camera){
    this.printables.remove(camera);
  }

  public int lengthPrintables(){
    return this.printables.size();
  }

  public String printAllDetails(){
    String details = "";
    for(Printable printable : printables){
      details += " " + printable.printDetails();
    }
    return details;
  }
}
