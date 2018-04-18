package com.Konovalov;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;


public class Main {

    public static void main(String[] args) {
        File file = new File("json.txt");
        String result = FileOperation.readFile(file);
        System.out.println(result);
        Gson gson = new GsonBuilder().create();
        Name name = gson.fromJson(result, Name.class);
        System.out.println(name.getName());
        System.out.println(name.getAddress().getCountry());

    }
}
