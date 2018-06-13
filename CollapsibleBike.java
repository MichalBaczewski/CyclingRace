package com.michalbaczewski.race;

public class CollapsibleBike implements Bike {

    private int gearsCount = 1;
    private int currentGear = 1;

    // inaczej powinno być! Metoda powinna wyrzucić wyjątek
    @Override
    public boolean changeGear(int gear) throws UnsupportedOperationException{
        new UnsupportedOperationException();
        return false;
    }

    @Override
    public int numberOfGears() {
        return 1;
    }

    @Override
    public int currentGear() {
        return 1;
    }
}
