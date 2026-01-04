package sampleQuestions2.secondQuestion;

public class FreelanceUtility {

    public Freelancer extractDetails(String freelancerDetails){
        String parts[] = freelancerDetails.split(",");
        String freelancerID = parts[0];
        String freelancerName = parts[1];
        double hourlyRate = Double.parseDouble(parts[2]);
        int hoursWorked = Integer.parseInt(parts[3]);
        int serviceChargePercentage = Integer.parseInt(parts[4]);

       return (new Freelancer(freelancerID, freelancerName, hourlyRate, hoursWorked, serviceChargePercentage));
    }

}
