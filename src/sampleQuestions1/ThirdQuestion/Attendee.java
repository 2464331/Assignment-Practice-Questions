package sampleQuestions1.ThirdQuestion;

// Attendee class
//class Attendee extends ParticipantInfo {
//    private double walletBalance;
//
//    public Attendee(String participantId, String name, String email, long phoneNumber, double walletBalance) {
//        super(participantId, name, email, phoneNumber);
//        this.walletBalance = walletBalance;
//    }
//
//    public double getWalletBalance() {
//        return walletBalance;
//    }
//
//    public void setWalletBalance(double walletBalance) {
//        this.walletBalance = walletBalance;
//    }
//
//    public double calculateBuyingCost(int ticketsToBuy, double pricePerTicket) {
//        double cost = ticketsToBuy * pricePerTicket;
//        if (cost > walletBalance) {
//            return -1;
//        }
//        return cost;
//    }
//}


class Attendee extends ParticipantInfo{
    private double walletBalance;
    Attendee(String participantId, String name, String email, long phoneNumber, double walletBalance){
        super(participantId, name, email, phoneNumber);
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public double calculateBuyingCost(int ticketsToBuy, double pricePerTicket){
        double total = ticketsToBuy * pricePerTicket;
        if(total > walletBalance){
            return -1;
        }
        else{
            return total;
        }
    }

}
