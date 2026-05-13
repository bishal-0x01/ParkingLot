package services.fee;

import entities.Ticket;

public class MinuteBasedFeeStrategy implements FeeStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        long entryTime = ticket.getEntryTime().getTime();
        long exitTime = (ticket.getExitTime() != null) ? ticket.getExitTime().getTime() : System.currentTimeMillis();
        long durationInMinutes = (exitTime - entryTime) / (1000 * 60);
        return durationInMinutes * 0.5; // Assuming $0.5 per minute
    }
}
