package com.hemebiotech.analytics.reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SymptomsFileReader implements Reader{
    @Override
    public List<String> read(String pathIn) {
        String symptomsCurrentLine;
        List<String> result = new ArrayList<>();

        try (BufferedReader symptomReader = new BufferedReader(new FileReader(pathIn))){

            while ((symptomsCurrentLine = symptomReader.readLine()) != null) {

                result.add(symptomsCurrentLine);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERREUR : Le fichier n'a pas été trouvé ! "+pathIn+" introuvable.");
        }

        catch (IOException e) {
            System.out.println("ERREUR : Le fichier n'a pas pu être lu.");
            e.printStackTrace();

        }
        return result;
    }
}
