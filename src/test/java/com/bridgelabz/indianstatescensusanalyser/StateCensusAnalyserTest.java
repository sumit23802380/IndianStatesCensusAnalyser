package com.bridgelabz.indianstatescensusanalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StateCensusAnalyserTest {
    StateCensusAnalyser stateCensusAnalyser;
    @Before
    public void setUp() {

    }
    @Test
    public void numberOfRecordMatches(){
        List<State> stateList = StateCensusAnalyser.loadCSVData("data/StateCensus.csv");
        int stateListSize = stateList.size();
        Assert.assertEquals(37 , stateListSize);
    }
}