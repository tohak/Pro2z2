package com.Konovalov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {

    public static String readFile(File file) {
        String temp;
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (; (temp = reader.readLine()) != null; )
                sb.append(temp);
            sb.append(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
