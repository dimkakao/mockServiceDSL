package org.dmytro.demodsl.util;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.StringJoiner;

@Slf4j
public class StringUtils {

    public static String indent(String input, int tabCount) {
        if (input == null || tabCount <= 0) {
            return input;
        }
        StringBuilder indentedString = new StringBuilder();
        String indent = " ".repeat(tabCount);

        for (String line : input.split("\n")) {
            indentedString.append(indent).append(line).append("\n");
        }

        return indentedString.toString().trim();
    }

    public static String indent(String input) {
        int tabCount = 4;
        return indent(input, tabCount);
    }

    public static String readResourceFile(String fileName) {
        String content;
        log.info("Reading file: {}", fileName);
        try {
            URL resource = StringUtils.class.getClassLoader().getResource(fileName);
            log.info("URL: {}", resource);
            if (resource == null) {
                log.error("File not found: {}", fileName);
                throw new RuntimeException("File not found: " + fileName);
            }
            Path path = Paths.get(resource.toURI());
            log.info("Path: {}", path);
            content = Files.readString(path);
            log.info("File read successfully: {}", fileName);
        } catch (IOException | URISyntaxException e) {
            log.error("Failed to read file: {}", fileName, e);
            throw new RuntimeException("Failed to read file: " + fileName, e);
        }
        return content;
    }

    public static String mapToQueryString(Map<String, String> map) {
        StringJoiner joiner = new StringJoiner("&");
        map.forEach((key, value) -> joiner.add(key + "=" + value));
        return joiner.toString();
    }
}
