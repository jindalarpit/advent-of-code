package com.adventofcode.arguments;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratorArguments {

    private final Map<GeneratorArgumentType, String> argumentMap = new HashMap<>();

    public GeneratorArguments put(GeneratorArgumentType type, String value) {
        argumentMap.put(type, value);
        return this;
    }

    public String get(GeneratorArgumentType type) {
        return argumentMap.get(type);
    }

    public Set<Map.Entry<GeneratorArgumentType, String>> entries() {
        return argumentMap.entrySet();
    }

    @AllArgsConstructor
    public enum GeneratorArgumentType {
        YEAR(0, "Year", false),
        DAY(1, "Day", false),
        PART(2, "Part", false),
        DESCRIPTION(3, "Description", false),
        LINK(4, "Link", false),
        TAGS(5, "Tags", false),
        RESPONSE_TYPE(6, "Answer type", false),
        TEST_INPUT(7, "Test input", true),
        TEST_RESPONSE(8, "Test answer", false),
        INPUT(9, "Input", true),
        ;

        @Getter
        private int ordinal;
        @Getter
        private String name;
        @Getter
        private boolean multiline;

    }

}
