package com.hemebiotech.analytics.writer;

import java.util.List;
import java.util.Map;

public interface Writer {
    /**
     * Ecrit dans un fichier pathOut, la map récupéré avec les symptômes comptés et triés.
     * @param symptomsFiltered map contenant les symptomes comptés et triés
     * @param pathOut chemin du fichier de sorti
     * @return
     */
    List<String> write(Map<String, Long> symptomsFiltered, String pathOut);
}
