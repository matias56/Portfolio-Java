import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JPGSearch {
  public static void main(String[] args) throws IOException {
    Stream<Path> path = Files.walk(Paths.get("C:/Users/ggemi/OneDrive/Imágenes"));
    path = path.filter(var -> var.toString().endsWith(".jpg"));
    path.forEach(System.out::println);
  }
}
