/*
 * CommonPackage
 *
 * Copyright (c) 2021
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@UtilityClass
public class IOUtils {
    /**
     * Gets InputStream of a file in the resource
     * @param classLoader the classLoader of the program
     * @param file filename
     * @return an InputStream to the required file
     * @throws FileNotFoundException throws an exception when couldn't find the required file in the resource of the program
     */
    public InputStream getInputStream(@NonNull ClassLoader classLoader, String file) throws FileNotFoundException {
        InputStream inputStream = classLoader.getResourceAsStream(file);

        if (inputStream == null) {
            throw new FileNotFoundException(file + " doesn't exist!");
        }
        return inputStream;
    }

    public CSVReader getCSVReader(@NonNull InputStream inputStream) {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        return new CSVReaderBuilder(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .withCSVParser(csvParser).build();
    }
}
