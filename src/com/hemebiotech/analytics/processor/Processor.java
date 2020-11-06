package com.hemebiotech.analytics.processor;

import java.util.Collection;
import java.util.Map;

public interface Processor {
    /**
     * Récupère une collection de string et les identifies et les comptes.
     * @param collection une map avec les symptomes.
     * @return
     */
    Map<String, Long> process(Collection<String> collection);
}
