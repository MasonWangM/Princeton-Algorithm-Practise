package com.sort.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileUtil {
    public static int[] getArray(String path) throws IOException {
        List<String> lines = null;
        lines = Files.readAllLines(new File(path).toPath());
        int[] numbers = lines.stream()
                .mapToInt(Integer::parseInt)
                .toArray();
        return numbers;
    }
}
