package sampleQuestions1.FifthQuestion;

import java.util.*;

public class LabTestInfo {
    private List<String> testList = new ArrayList<>();
    public void addTest(String testDetails){
        testList.add(testDetails);
    }

    public List<String> getTestWithinGivenRange(int min, int max){
        List<String> filterList = new ArrayList<>();

        for(String item : testList){
            String[] parts = item.split(":");
            String testName = parts[0];
            int cost = Integer.parseInt(parts[1]);

            if(cost >= min && cost <= max){
                filterList.add(testName);
            }
        }
        return filterList;
    }


}
