package com.hemebiotech.analytics.reader;

import java.util.List;

public interface Reader {
    /**
     *
     * @param pathIn
     * @return
     */
    public List<String> read(String pathIn);
}
