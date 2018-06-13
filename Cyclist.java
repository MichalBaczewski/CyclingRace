package com.michalbaczewski.race;

public class Cyclist {

    String name;
    Bike bike;

    public Cyclist(String name, Bike bike) {
        this.name = name;
        this.bike = bike;
    }

    private void gearUp() throws UnsupportedOperationException {
        try {
            bike.changeGear(bike.currentGear() + 1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Nieudana zmiana biegu. Aktualny: " + bike.currentGear()
                    + ", dostepne 1 - " + bike.numberOfGears());
        }
    }

    private void gearDown() throws UnsupportedOperationException {
        try {
            bike.changeGear(bike.currentGear() - 1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Nieudana zmiana biegu. Aktualny: " + bike.currentGear()
                    + ", dostepne 1 - " + bike.numberOfGears());
        }
    }

    public void printCurrentGear() {
        System.out.println("Aktualny bieg: " + bike.currentGear());
    }

    public static void main(String[] args) throws UnsupportedOperationException {
        Cyclist mountainCyclist = new Cyclist("Marek", new MountainBike(3, 2)); // nie wiem czy dobrze robie ?
        mountainCyclist.gearUp();
        mountainCyclist.printCurrentGear();
        mountainCyclist.gearUp();
        mountainCyclist.printCurrentGear();
        mountainCyclist.gearDown();
        mountainCyclist.printCurrentGear();
        mountainCyclist.gearDown();
        mountainCyclist.printCurrentGear();
        mountainCyclist.gearDown();
        mountainCyclist.printCurrentGear();
        System.out.println("----------------------");
        Cyclist villageCyclist = new Cyclist("Rysiek", new CollapsibleBike());
        villageCyclist.gearUp();
        villageCyclist.printCurrentGear();
        villageCyclist.gearDown();
        villageCyclist.printCurrentGear();
        villageCyclist.bike.changeGear(2);
        villageCyclist.printCurrentGear();
    }
}
