package com.bridgelabz.indianstatescensusanalyser;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Indian State Census Analyser");
        List<State> stateList = StateCensusAnalyser.loadCSVData("data/StateCensus.csv");
        Iterator<State> stateIterator = stateList.iterator();
        while (stateIterator.hasNext()){
            System.out.println(stateIterator.next());
        }
        System.out.println("Number of records in csv data : " + stateList.size());
    }
}