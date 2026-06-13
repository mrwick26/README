import java.util.HashMap;
import java.util.Map;

public class SampleMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Koala", "Bamboo");
        String food = map.get("koala"); //bamboo
        String other = map.getOrDefault("ant", "leaf"); //leaf
        for(String key: map.keySet())
            System.out.println(key+" "+ map.get(key)); //koala bamboo
    }
    
}
