package Model;

import java.util.Scanner;

public class Ship extends Vehicle{
        private String shipID;
        private Container[] containers;
        private int numCons;
        public Ship(){};
        public Ship(String shipID){};
        public Ship ( String shipID, Container container, String vehicleName, double fuelAmount,
                      double carryingCapability, double fuelCapability, String currentPort) {
            super(vehicleName, fuelAmount, carryingCapability, fuelCapability,currentPort);
            this.shipID = shipID;
            containers = new Container[numCons];
        }

        public Ship(Model.Ship ship) {
        }

        public String getShipID() {
            return shipID;
        }

        public void setShipID(String shipID) {
            this.shipID = shipID;
        }
        public void loadContainertoShip(int numCons){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adding a new container....");
            System.out.println("Enter the container ID: ");
            String conID = scanner.next();
            Container container = new Container(conID);
            containers[numCons] = new Container(container);
        }

    }

}
