///////////////////////////////////////////////////////////////////////////////
// File: productionline.MultimediaControlDriver.java
// By:   Greening, Zachary
// Date: October 15, 2018
// Description: A driver class to test the ability of any device that
//    implements productionline.MultimediaControl to be able to use the same method names.
//    In other words, demonstrate polymorphism.
///////////////////////////////////////////////////////////////////////////////

package productionline;


public class MultimediaControlDriver {

  /**
   * A driver class to demonstrate the storing and usage of both MoviePlayers and AudioPlayers in an
   * array of productionline.MultimediaControl devices. Polymorphism allows the usage of all methods
   * in interface productionline.MultimediaControl
   */
  public static void testMultimediaControlArray() {
    MultimediaControl[] devices = {new MoviePlayer("ipad",
        new Screen("1366x768", 60, 15), MonitorType.LCD),
        new AudioPlayer("ipod", "wav")};

    for (MultimediaControl device : devices) {
      System.out.println(device);
      System.out.println();
      device.next();
      device.play();
      device.previous();
      device.stop();
      System.out.println();
    }
  }

}
