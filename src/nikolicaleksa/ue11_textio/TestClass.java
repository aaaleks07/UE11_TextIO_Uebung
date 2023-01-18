package nikolicaleksa.ue11_textio;

import java.io.IOException;

import static nikolicaleksa.ue11_textio.DiverseMethoden.convertFileToLowerCase;
import static nikolicaleksa.ue11_textio.DiverseMethoden.convertFileToUppercase;

public class TestClass {
    public static void main(String[] args) throws IOException {
        //convertFileToUppercase("src/Files/convertFileToUppercase.txt", "src/Files/convertFileToUppercaseDest.txt");
        convertFileToLowerCase("src/Files/convertFileToLowercase.txt", "src/Files/convertFileToLowercaseDest.txt");
    }
}
