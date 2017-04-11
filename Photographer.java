import java.util.*;

public class Photographer{
  public ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public void addCamera(Camera camera){
    this.cameras.add(camera);
  }

  public void removeCamera(Camera camera){
    this.cameras.remove(camera);
  }

  public int lengthCameras(){
    return this.cameras.size();
  }
}
