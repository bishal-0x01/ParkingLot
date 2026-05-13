package services.fee;

import entities.Ticket;

public class MinuteBasedFeeStrategy implements FeeStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        return 0;
    }
}
