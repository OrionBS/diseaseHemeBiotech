package com.hemebiotech.analytics.processor;

import java.util.Collection;
import java.util.Map;

public interface Processor {
    /**
     *
     * @param collection
     * @return
     */
    Map<String, Long> process(Collection<String> collection);
}
