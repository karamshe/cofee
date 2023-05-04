package org.example;

import org.example.model.SizeType;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class SizeTypesFileImpl implements SizeTypes {

    private final File file;

    public SizeTypesFileImpl(File file) {
        this.file = file;
    }

    @Override
    public List<SizeType> getAllSizeTypes() {
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            return reader
                    .lines()
                    .map(this::newSizeType)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private SizeType newSizeType(String line) {
        String[] data = line.split(",");
        return new SizeType(data[0]);
    }
}
