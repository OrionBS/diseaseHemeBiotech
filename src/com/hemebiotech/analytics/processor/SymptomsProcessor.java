package com.hemebiotech.analytics.processor;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymptomsProcessor implements Processor {
    @Override
    public Map<String, Long> process(Collection<String> collection) {
        if (collection == null) {
            return Collections.emptyMap();
        } else {
            return collection.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        }
    }
}
