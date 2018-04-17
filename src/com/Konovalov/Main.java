package com.Konovalov;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

    public static void main(String[] args) {
        String result = readFile();
        System.out.println(result);
        Gson gson = new GsonBuilder().create();
//        JSON json= gson.fromJson(result, JSON.class);
        Name name = gson.fromJson(result, Name.class);
        System.out.println(name.name);
        System.out.println(name.address.country);

    }

    private static String readFile() {
        File file = new File("D:\\json.txt");
        String temp = "";
        StringBuffer sb = new StringBuffer();

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
