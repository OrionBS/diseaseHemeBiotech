package com.hemebiotech.analytics.writer;

import java.util.List;
import java.util.Map;

public interface Writer {
    /**
     *
     * @param symptomsFiltered
     * @param pathOut
     * @return
     */
    public List<String> write(Map<String, Long> symptomsFiltered, String pathOut);
}
