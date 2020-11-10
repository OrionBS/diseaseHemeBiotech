package com.hemebiotech.analytics.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class SymptomsFileWriter implements Writer {
    @Override
    public void write(Map<String, Long> symptomsFiltered, String pathOut) {
        try (BufferedWriter symptomsWriter = new BufferedWriter(new FileWriter(pathOut))) {
            for (String symptom : symptomsFiltered.keySet().stream().sorted().collect(Collectors.toList())) {
                symptomsWriter.write(symptom+","+symptomsFiltered.get(symptom));
                symptomsWriter.newLine();
            }
            System.out.println("Traitement terminé !");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
