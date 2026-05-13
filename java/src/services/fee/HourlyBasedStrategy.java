package services.fee;

import entities.Ticket;

public class HourlyBasedStrategy implements FeeStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        return 0;
    }
}
