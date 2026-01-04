package sampleQuestions2.thirdQuestion;

public class OnlineLearner extends Learner{
    private double platformFee;

    public OnlineLearner(long learnerID, String learnerName, String programName, int durationInMonths, double baseFee, double platformFee) {
        super(learnerID, learnerName, programName, durationInMonths, baseFee);
        this.platformFee = platformFee;
    }

    public double getPlatformFee() {
        return platformFee;
    }

    public void setPlatformFee(double platformFee) {
        this.platformFee = platformFee;
    }

    public double calculateOnlineFee(){
        int duration = getDurationInMonths();
        double base = getBaseFee();
        if(!(duration>=0 && duration<=18)){
            return -1;
        }
        return (base* duration) + platformFee;
    }
}
