package nikolicaleksa.ue11_textio;

import java.io.IOException;

import static nikolicaleksa.ue11_textio.DiverseMethoden.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        //convertFileToUppercase("src/Files/convertFileToUppercase.txt", "src/Files/convertFileToUppercaseDest.txt");
        //convertFileToLowerCase("src/Files/convertFileToLowercase.txt", "src/Files/convertFileToLowercaseDest.txt");
        System.out.println(compareFiles("src/Files/compareFiles.txt", "src/Files/compareFiles2.txt"));
    }
}
