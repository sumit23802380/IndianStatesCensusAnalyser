package com.bridgelabz.indianstatescensusanalyser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StateCensusAnalyser {
    public static List<State> loadCSVData(String filePath){
        List<State> statesList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                statesList.add(new State(data[1] , Integer.parseInt(data[2]) , data[3].substring(0 , data[3].length()-1)));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return statesList;
    }
}
