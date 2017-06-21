package pl.kordulewski.memory.leaks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Michał Kordulewski on 21.06.17.
 */
public class MainClass {

    public static void main(String... args) {
        InputStream input = "".getClass().getResourceAsStream("/info.txt");
        String result = getStringFromInputStream(input);
        System.out.println(result);
        try {
            input.close();
        } catch (IOException e) {
            System.out.println("Unknown error");
        }
    }

    private static String getStringFromInputStream(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Unknown error");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Unknown error");
                }
            }
        }
        return sb.toString();
    }

}
