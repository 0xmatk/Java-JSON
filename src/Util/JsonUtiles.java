package Util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtiles {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();


    public static <T> void guardarComoJson(String archivo, T objeto) {
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T leerDesdeJson(String archivo, Class<T> clase) {
        try (FileReader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
