import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


//import org.assertj.core.api.Assert.*;






class ConvertTest1 {

    @Test
    public void numberConverter1() {
        NumberConverter numberConverter = new NumberConverter();
        
        assertThat("X").isEqualTo(numberConverter.convert(10));
                
    }

}
