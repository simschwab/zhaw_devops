import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;


class ConvertTest11 {

    public Integer roman;

    @Test
    public void numberConverter11() {
        NumberConverter numberConverter = new NumberConverter();
        
        HashMap<String, Integer> characters = numberConverter.getCharacterMap();

        numberConverter.put();

        roman = characters.get("M");

        assertThat("CC").isEqualTo(numberConverter.convert(200));
        assertThat("XCIX").isEqualTo(numberConverter.convert(99));
        assertThat("CMXCIX").isEqualTo(numberConverter.convert(999));
        assertThat("MIV").isEqualTo(numberConverter.convert(1004));
        assertThat("MMMMMMMMMMMMCCCXLV").isEqualTo(numberConverter.convert(12345));
        assertThat("MMMMDLXVIII").isEqualTo(numberConverter.convert(4568));
                
    }

}