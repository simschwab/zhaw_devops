import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ConvertTest2 {

    public String roman;

    @Test
    public void numberConverter2() {
        NumberConverter numberConverter = new NumberConverter();
        
        roman = numberConverter.getCharacter();

        assertThat(roman).isEqualTo(numberConverter.convert(10));
                
    }

}