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
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
