package org.example;

import org.example.model.MilkType;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class MilkTypesFileImpl implements MilkTypes {
    private final File file;

    public MilkTypesFileImpl(File file) {
        this.file = file;
    }

    @Override
    public List<MilkType> getAllMilkTypes() {
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            return reader
                    .lines()
                    .map(this::newMilkType)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private MilkType newMilkType(String line) {
        String[] data = line.split(",");
        return new MilkType(data[0], Double.parseDouble(data[1]));
    }

}
