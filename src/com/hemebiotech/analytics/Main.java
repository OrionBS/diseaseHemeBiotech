package com.hemebiotech.analytics;

import com.hemebiotech.analytics.processor.Processor;
import com.hemebiotech.analytics.processor.SymptomsProcessor;
import com.hemebiotech.analytics.reader.Reader;
import com.hemebiotech.analytics.reader.SymptomsFileReader;
import com.hemebiotech.analytics.writer.SymptomsFileWriter;
import com.hemebiotech.analytics.writer.Writer;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String pathIn = "symptoms.txt";
        String pathOut = "results.csv";

        System.out.println("Démarrage !");

        System.out.println("Lecture du fichier "+pathIn+".");
        Reader reader = new SymptomsFileReader();
        List<String> symptoms = reader.read(pathIn);

        System.out.println("Itération et tri des symptomes.");
        Processor processor = new SymptomsProcessor();
        Map<String, Long> symptomsIteration = processor.process(symptoms);

        System.out.println("Génération du fichier de traitement de données.");
        Writer writer = new SymptomsFileWriter();
        List<String> symptomsWriting = writer.write(symptomsIteration, pathOut);
    }
}
