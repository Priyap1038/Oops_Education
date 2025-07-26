import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileStorageService {
    public void saveData(List<? extends Storable> items, String fileName){
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
    
    for(Storable item : items){
        writer.println(item.toDataString());
    }
    System.out.println("Data successfully added to: "+ fileName);
} catch (IOException e) {
    // TODO: handle exception
    System.out.println("Error in saving data to file: " +fileName +":"+ e.getLocalizedMessage());

}
    }
}
