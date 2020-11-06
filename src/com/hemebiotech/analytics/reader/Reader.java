package com.hemebiotech.analytics.reader;

import java.util.List;

public interface Reader {
    /**
     * Récupération d'une liste de string contenant les symptômes non triés ou comptés.
     * @param pathIn chemin du fichier texte.
     * @return
     */
    public List<String> read(String pathIn);
}
