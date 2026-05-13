package services.fee;

import entities.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
