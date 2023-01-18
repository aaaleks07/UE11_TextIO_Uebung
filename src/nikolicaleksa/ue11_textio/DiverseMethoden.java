package nikolicaleksa.ue11_textio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Aleksa Nikolic
 */
public class DiverseMethoden {

    /**
     * Converts the files text to uppercase
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void convertFileToUppercase(String srcFile, String destFile) throws IOException{
        try(
                BufferedReader src = Files.newBufferedReader(
                        Paths.get(srcFile)
                );
                BufferedWriter dest = Files.newBufferedWriter(
                        Paths.get(destFile)
                )
                ) {
            String textBuffer = "";
            String text = "";
            while((textBuffer = src.readLine()) != null){
                text += textBuffer + "\n";
            }

            dest.write(text.toUpperCase());
        }
    }

    /**
     * Converts the file text to lowercase
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void convertFileToLowerCase(String srcFile, String destFile) throws IOException{
        try(
                BufferedReader src = Files.newBufferedReader(
                        Paths.get(srcFile)
                );
                BufferedWriter dest = Files.newBufferedWriter(
                        Paths.get(destFile)
                )
            ){
            String textBuffer = "";
            String text = "";
            while((textBuffer = src.readLine()) != null){
                text = textBuffer + "\n";
            }

            dest.write(text.toLowerCase());
        }
    }
}
