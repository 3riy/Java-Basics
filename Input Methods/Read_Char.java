import java.io.IOException;

public class Read_Char {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a character: ");
        int ch = System.in.read();
        System.out.println("You entered: " + (char)ch);
        // ch = (char) System.in.read();
        // System.out.println("Character entered is = " + ch);
    }
}
