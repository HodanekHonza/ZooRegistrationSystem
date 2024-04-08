package org.example.zoo;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
public class CsvWriterVeterinary {
    public static void writeDataLineByLine(String filePath, Animal animal) {
        boolean fileExists = new File(filePath).exists();
        String[] header = {"UUIDofAnimal", "nameOfAnimal", "timeOfFeeding", "timeCheckedByVet"};
        try {
            String[] data = {String.valueOf(animal.getUUID()), animal.getName(), String.valueOf(animal.getTimeOfFeeding()), String.valueOf(new Date())};
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
                if (!fileExists) {
                    writer.writeNext(header);
                }
                writer.writeNext(data);
            } catch (IOException e) {
                System.err.println("Error writing to the CSV file: " + e.getMessage());
            }
        } catch (NullPointerException e) {

        }


    }

//    public static void readDataLineByLine(String csvFile, Integer numberOfCustomer) {
//        String line = "";
//        String splitBy = ",";
//        try {
//            //parsing a CSV file into BufferedReader class constructor
//            BufferedReader br = new BufferedReader(new FileReader(csvFile));
//
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(splitBy);
//                for (int i = 0; i < data.length; i++) {
//
//                    data[i] = data[i].replaceAll("^\"|\"$", "");
//                }
//                try {
//                    if (Integer.parseInt(data[0]) == numberOfCustomer) {
//                        System.out.println("Found customer with ID " + numberOfCustomer + ": " + line);
//                    }
//                } catch (NumberFormatException e) {
//                    System.out.println(e);
//                }
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

