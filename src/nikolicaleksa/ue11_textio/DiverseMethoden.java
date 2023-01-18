package nikolicaleksa.ue11_textio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
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

    /**
     * Checks the equality between <tt>srcFile1</tt> and <tt>srcFile2</tt>;
     * @param srcFile1
     * @param srcFile2
     * @return equality between <tt>srcFile1</tt> and <tt>srcFile2</tt>
     * @throws IOException
     */
    public static boolean compareFiles(String srcFile1, String srcFile2) throws IOException{
        try(
                BufferedReader fileone = Files.newBufferedReader(
                        Paths.get(srcFile1)
                );
                BufferedReader filetwo = Files.newBufferedReader(
                        Paths.get(srcFile2)
                );
                ){
            String textBuffer = "";
            String textone = "";
            String texttwo = "";

            while ((textBuffer = fileone.readLine()) != null){
                textone += textBuffer + "\n";
            }

            while ((textBuffer = filetwo.readLine()) != null){
                texttwo += textBuffer + "\n";
            }

            return textone.equals(texttwo);
        }
    }

    /**
     * Encrypts the files text content with the "caeser-encryption"
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void encryptFile(String srcFile, String destFile) throws IOException{
        try(
                BufferedReader src = Files.newBufferedReader(
                        Paths.get(srcFile)
                );
                BufferedWriter dest = Files.newBufferedWriter(
                        Paths.get(destFile)
                );
                ){
            String textBuffer = "";
            String text = "";

            while((textBuffer = src.readLine()) != null){
                text += textBuffer + "\n";
            }

            char[] textChar = text.toCharArray();
            String endText = "";
            for (int i = 0; i < textChar.length; i++) {
                textChar[i]+=3;
                endText += textChar[i];
            }

            dest.write(endText);
        }
    }

    /**
     * Decrypts the files text content with the "caeser-encryption"
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void decryptFile(String srcFile, String destFile) throws IOException{
        try(
                BufferedReader src = Files.newBufferedReader(
                        Paths.get(srcFile)
                );
                BufferedWriter dest = Files.newBufferedWriter(
                        Paths.get(destFile)
                );
        ){
            String textBuffer = "";
            String text = "";

            while((textBuffer = src.readLine()) != null){
                text += textBuffer + "\n";
            }

            text = text.trim();

            char[] textChar = text.toCharArray();
            String endText = "";
            for (int i = 0; i < textChar.length; i++) {
                textChar[i]-=3;
                endText += textChar[i];
            }

            dest.write(endText);
        }
    }
}
