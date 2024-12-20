package com.adventofcode;

import com.adventofcode.arguments.GeneratorArguments;
import com.adventofcode.arguments.GeneratorArguments.GeneratorArgumentType;
import com.adventofcode.generator.Generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.adventofcode.arguments.GeneratorArguments.GeneratorArgumentType.*;

public class GeneratorRunner {

    public static void main(String[] args) throws IOException {
        GeneratorArguments arguments = new GeneratorArguments();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (GeneratorArgumentType type : GeneratorArgumentType.values()) {
                arguments.put(type, getInput(reader, type));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Generator().generate(arguments);
        System.out.printf("Generated solution for year %s day %s part %s", arguments.get(YEAR), arguments.get(DAY), arguments.get(PART));
    }

    private static String getInput(BufferedReader reader, GeneratorArgumentType type) throws IOException {
        System.out.print(type.getName() + ": ");
        if (type.isMultiline()) {
            String line = reader.readLine();
            StringBuilder builder = new StringBuilder(line);
            do {
                line = reader.readLine();
                builder.append("\n").append(line);
            } while (!line.equals("!q"));
            return builder.toString().replace("!q", "");
        } else {
            return reader.readLine();
        }
    }


}
