import java.util.HashMap;



public class NumberConverter {
    
    String character = "X";

    public String getCharacter() {
        return character;
    }

    HashMap<String, Integer> characters = new HashMap<>();

    public HashMap<String, Integer> getCharacterMap(){
        return characters;
    }

    
    public void put(){
        characters.put("M", 1000);
        
    }
    
    
    public String convert(int i) {
    
        StringBuilder sb = new StringBuilder();

        for(HashMap.Entry<String, Integer> entry : characters.entrySet()) {
            
            while(i >= entry.getValue()) {
                i = i - entry.getValue();
                sb.append(entry.getKey());
            }
        }
        
        //return String.valueOf(i);
        return sb.toString();
    }

}
