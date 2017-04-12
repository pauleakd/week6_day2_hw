import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  AnalogCamera camera;
  DigitalCamera cameraa;

  @Before
  public void before(){
    photographer = new Photographer();
    camera = new AnalogCamera();
    cameraa = new DigitalCamera();
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.lengthPrintables());
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(camera);
    photographer.removeCamera(camera);
    assertEquals(0, photographer.lengthPrintables());
  }

  @Test
  public void canPrintAllDetails(){
    photographer.addCamera(camera);
    photographer.addCamera(cameraa);
    assertEquals(" This is an Analog Camera This is a Digital Camera",
                 photographer.printAllDetails());
  }

}
