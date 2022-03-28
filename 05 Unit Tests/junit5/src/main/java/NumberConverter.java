import java.util.HashMap;



public class NumberConverter {
    
    String character = "X";

    public String getCharacter() {
        return character;
    }

    HashMap<String, String> characters = new HashMap<>();

    public HashMap<String, String> getCharacterMap(){
        return characters;
    }

    
    public String convert(int i) {
       
       // characters.put("M", 1000);    
        
        return String.valueOf(i);
    }

}
