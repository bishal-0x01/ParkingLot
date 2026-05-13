package services.fee;

import entities.Ticket;

import java.util.Objects;

public class HourlyBasedStrategy implements FeeStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        long entryTime = ticket.getEntryTime().getTime();
        long exitTime = (Objects.nonNull(ticket.getExitTime()))?ticket.getExitTime().getTime():System.currentTimeMillis();
        long durationInHours = (exitTime - entryTime) / (1000 * 60 * 60);
        return durationInHours * 10; // Assuming $10 per hour
    }
}
