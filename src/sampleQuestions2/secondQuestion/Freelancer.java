package sampleQuestions2.secondQuestion;

public class Freelancer {
    String freelancerID;
    String freelancerName;
    double hourlyRate;
    int hoursWorked;
    int serviceChargePercentage;

    public Freelancer(String freelancerID, String freelancerName, double hourlyRate, int hoursWorked, int serviceChargePercentage) {
        this.freelancerID = freelancerID;
        this.freelancerName = freelancerName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.serviceChargePercentage = serviceChargePercentage;
    }

    public double calculatePaymet() {
        if (!(hourlyRate > 0 && hoursWorked > 0 && (serviceChargePercentage > 0 && serviceChargePercentage < 15))) {
            return -1;
        }
        double per = (double) serviceChargePercentage / 100 + 1;
        return (hourlyRate * hoursWorked) * per;

    }

}

