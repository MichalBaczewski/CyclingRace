package com.michalbaczewski.race;

public class MountainBike implements Bike {

    private int gearsCount;
    private int currentGear;

    public MountainBike(int gearsCount, int currentGear) {
        this.gearsCount = gearsCount;
        this.currentGear = currentGear;
    }

    @Override
    public boolean changeGear(int gear) throws UnsupportedOperationException {
        boolean changeGearResult = false;
        if (isGearChangeValid(gear)) {
            currentGear = gear;
            changeGearResult = true;
        } else {
            throw new UnsupportedOperationException("Nieudana zmiana biegu");
        }
        return changeGearResult;
    }

    public boolean isGearChangeValid(int gear) {
        return ((gear == currentGear + 1) && (currentGear + 1 <= gearsCount))
                || ((gear == currentGear - 1) && (currentGear - 1 >= 1));
    }

    @Override
    public int numberOfGears() {
        return gearsCount;
    }

    @Override
    public int currentGear() {
        return currentGear;
    }
}
