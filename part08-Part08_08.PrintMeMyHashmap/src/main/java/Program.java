
import java.util.HashMap;

public class Program {
    
    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String,String> hashmap) {
        System.out.println(hashmap.keySet());
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String textToPrint: hashmap.keySet()){
            if(textToPrint.contains(text)) {
                System.out.println(textToPrint);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String keyToCheck: hashmap.keySet()) {
            if(keyToCheck.contains(text)){
                System.out.println(hashmap.get(keyToCheck));
            }
        }
    }

}
