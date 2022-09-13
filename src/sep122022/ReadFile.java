package sep122022;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) {
        Path filePath = Paths.get("/home/agent47/Videos/OBS_Vid/Codes", "JavaProjects.txt");

        try (Stream<String> lines = Files.lines(filePath))
        {
            List<String> filteredLines = lines
                                         .filter(s -> s.startsWith("2"))
                                         .collect(Collectors.toList());
            filteredLines.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("no line available");
        }
    }
    
}
