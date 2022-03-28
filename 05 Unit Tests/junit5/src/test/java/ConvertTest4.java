import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;


class ConvertTest4 {

    public Integer roman;

    @Test
    public void numberConverter4() {
        NumberConverter numberConverter = new NumberConverter();
        
        HashMap<String, Integer> characters = numberConverter.getCharacterMap();
        
        
        numberConverter.put();

        roman = characters.get("M");


        assertThat("CM").isEqualTo(numberConverter.convert(900));
                
    }

}