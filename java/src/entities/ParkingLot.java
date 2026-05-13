package entities;
import java.io.*;
import java.util.*;
import constants.*;

public class ParkingLot {

    private final List<Floors> floors = new ArrayList<>();

    private ParkingLot() {}

    private static class Holder {
        private static final ParkingLot INSTANCE = new ParkingLot();
    }

    public static ParkingLot getInstance() {
        return Holder.INSTANCE;
    }


    public void init(int floorCount, int smallSpots, int mediumSpots, int largeSpots) {
        for (int i = 1; i <= floorCount; i++) {
            floors.add(buildFloor(i, smallSpots, mediumSpots, largeSpots));
        }
    }

    public List<Floors> getFloors() {
        return Collections.unmodifiableList(floors);
    }

    private Floors buildFloor(int id, int smallCount, int mediumCount, int largeCount) {
        Floors floor = new Floors();
        floor.setId(id);

        List<ParkingSpot> spots = new ArrayList<>();
        int spotId = 1;

        for (int i = 0; i < smallCount; i++) {
            spots.add(buildParkingSpot(spotId++, id, SpotType.SMALL));
        }
        for (int i = 0; i < mediumCount; i++) {
            spots.add(buildParkingSpot(spotId++, id, SpotType.MEDIUM));
        }
        for (int i = 0; i < largeCount; i++) {
            spots.add(buildParkingSpot(spotId++, id, SpotType.LARGE));
        }

        floor.setParkingSpotList(spots);
        floor.setFullyOccupied(false);
        return floor;
    }

    
    private ParkingSpot buildParkingSpot(int id, int floorId, SpotType type) {
        ParkingSpot spot = new ParkingSpot();
        spot.setId(id);
        spot.setFloorId(floorId);
        spot.setSpotType(type);
        spot.setOccupied(false);
        return spot;
    }
}