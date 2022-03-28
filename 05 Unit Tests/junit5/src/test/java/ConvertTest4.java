import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;


class ConvertTest3 {

    public Integer roman;

    @Test
    public void numberConverter3() {
        NumberConverter numberConverter = new NumberConverter();
        
        HashMap<String, Integer> characters = numberConverter.getCharacterMap();
        
        //characters.put("M", 1000);
        numberConverter.put();

        roman = characters.get("M");

        //System.out.println(roman);

        assertThat("CM").isEqualTo(numberConverter.convert(900));
                
    }

}