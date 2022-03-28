import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;


class ConvertTest5 {

    public Integer roman;

    @Test
    public void numberConverter5() {
        NumberConverter numberConverter = new NumberConverter();
        
        HashMap<String, Integer> characters = numberConverter.getCharacterMap();
        
        
        numberConverter.put();

        roman = characters.get("M");


        assertThat("CM").isEqualTo(numberConverter.convert(900));
        assertThat("D").isEqualTo(numberConverter.convert(500));
        //assertThat("CD").isEqualTo(numberConverter.convert(400));
        //assertThat("C").isEqualTo(numberConverter.convert(100));
        //assertThat("XC").isEqualTo(numberConverter.convert(90));
        //assertThat("L").isEqualTo(numberConverter.convert(50));
        //assertThat("XL").isEqualTo(numberConverter.convert(40));
        //assertThat("X").isEqualTo(numberConverter.convert(10));
        //assertThat("IX").isEqualTo(numberConverter.convert(9));
        //assertThat("V").isEqualTo(numberConverter.convert(5));
        //assertThat("IV").isEqualTo(numberConverter.convert(4));
        //assertThat("I").isEqualTo(numberConverter.convert(1));
                
    }

}