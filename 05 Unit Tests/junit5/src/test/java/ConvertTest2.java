import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ConvertTest2 {

    @Test
    public void numberConverter2() {
        NumberConverter numberConverter = new NumberConverter();
        
        String roman = NumberConverter.getCharacter(10);

        assertThat(roman).isEqualTo(numberConverter.convert(10));
                
    }

}