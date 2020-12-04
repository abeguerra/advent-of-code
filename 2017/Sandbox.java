import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {
  public static List<String> loadSimpleArray(String filePath) {
    ArrayList<String> names = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String strCurrentLine;
      while ((strCurrentLine = br.readLine()) != null) {
        names.add(strCurrentLine);
      }
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
    } catch (IOException e) {
      System.err.println("Unable to read the file.");
    }
    return names;
  }

  public static List<List<String>> loadNestedArray(String filePath) {
    List<List<String>> families = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String strCurrentLine;
      while ((strCurrentLine = br.readLine()) != null) {
        families.add(Arrays.asList(strCurrentLine.split("\\s+")));
      }
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
    } catch (IOException e) {
      System.err.println("Unable to read the file.");
    }
    return families;
  }

  public static Map<String, Integer> loadMap(String filePath) {
    HashMap<String, Integer> map = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String strCurrentLine;
      while ((strCurrentLine = br.readLine()) != null) {
        String[] tokens = strCurrentLine.split(" ");
        map.put(tokens[0], Integer.parseInt(tokens[1]));
      }
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
    } catch (IOException e) {
      System.err.println("Unable to read the file.");
    }

    return map;
  }

  public static void main(String[] args) {
    List<String> names = loadSimpleArray("input/test/simpleArray.txt");
    System.out.println(Arrays.toString(names.toArray()));

    List<List<String>> families = loadNestedArray("input/test/nestedArray.txt");
    System.out.println(Arrays.toString(families.toArray()));

    Map<String, Integer> map = loadMap("input/test/map.txt");
    map.forEach((k, v) -> System.out.println((k + ":" + v)));
  }
}
