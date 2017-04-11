import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  AnalogCamera camera;

@Before
public void before(){
  photographer = new Photographer();
  camera = new AnalogCamera();
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

}
