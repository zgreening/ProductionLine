///////////////////////////////////////////////////////////////////////////////
// File: Main.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: The driver class for Production Line application
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

  /**
   * Production line driver class main.
   *
   * @param args String arguments
   */
  public static void main(String[] args) {
    ArrayList<Product> arrayList;

    arrayList = testCollection();

    Collections.sort(arrayList);

    EmployeeInfo employee = new EmployeeInfo();

    ProcessFiles processFiles = new ProcessFiles();
    try {
      processFiles.writeFile(employee);
      processFiles.writeFile(testCollection());
    } catch (IOException exception) {
      System.out.println("Unable to write to file");
      exception.printStackTrace();
    }

    //productionline.AudioPlayerDriver.testAudioPlayer();
    //productionline.ScreenDriver.testScreen();
    //productionline.MoviePlayerDriver.testMoviePlayer();
    //productionline.MultimediaControlDriver.testMultimediaControlArray();
  }

  /**
   * Creates and returns an array list of Products.
   *
   * @return arrayList of Products
   */
  public static ArrayList testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  /**
   * A generic methed that prints all items in any collection sent to it.
   *
   * @param collection the collection of items to be printed
   * @param <T> the data type of the collection to be printed
   */
  public static <T> void print(Collection<T> collection) {
    for (T product : collection) {
      System.out.println(product);
    }
  }
}
