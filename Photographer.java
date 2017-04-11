import java.util.*;

public class Photographer{
  public ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public void addCamera(Camera camera){
    this.cameras.add(camera);
  }

  public int lenghtCameras(){
    return this.cameras.size();
  }
}
