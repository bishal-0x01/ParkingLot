package services;
import entities.*;
import constants.*;
import services.fee.FeeStrategy;
import services.fee.HourlyBasedStrategy;
import services.fee.MinuteBasedFeeStrategy;

import java.io.*;
import java.util.*;

import static constants.FeeStrategyEnum.HOUR;
import static constants.FeeStrategyEnum.MINUTE;

public class ExitGateService {

    public String freeSpot(Ticket ticket,FeeStrategyEnum feeStrategy){
        ParkingSpot spot = ticket.getParkingSpot();
        spot.setOccupied(false);

        FeeStrategy feeCalculator;

        feeCalculator = switch (feeStrategy) {
            case HOUR -> new HourlyBasedStrategy();
            case MINUTE -> new MinuteBasedFeeStrategy();
        };

        double fee = feeCalculator.calculateFee(ticket);

        return "Vehicle with license plate " + ticket.getVehicle().getId() + " has exited. Total fee: $" + fee;
    }
}
