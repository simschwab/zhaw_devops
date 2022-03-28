
public class Main {
    public static void main(String[] args) {
    
        NumberConverter numberConverter = new NumberConverter();
        
        numberConverter.put();

        int toConvert = 1;

        System.out.println("This is the Roman Character for the number " + toConvert + ": " + numberConverter.convert(toConvert));
        
        
    
    }
}
