
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
 
        ArrayList<DataValue> results = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new DataValue(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
                    .forEach(t -> results.add(t));
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }
        
        results.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
