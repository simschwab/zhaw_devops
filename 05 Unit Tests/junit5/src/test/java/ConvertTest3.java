import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;


class ConvertTest3 {

    public String roman;

    @Test
    public void numberConverter3() {
        NumberConverter numberConverter = new NumberConverter();
        
        HashMap<String, String> characters = numberConverter.getCharacterMap();
        
        characters.put("M", "1000");
        
        roman = characters.get("M");

        assertThat(roman).isEqualTo(numberConverter.convert(1000));
                
    }

}