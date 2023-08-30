package Model;

    public class Vehicle {
        private String vehicleName;
        private double fuelAmount;
        private double carryingCapability;
        private double fuelCapability;
        private String currentPort;

        public Vehicle(String vehicleName, double fuelAmount, double carryingCapability,
                       double fuelCapability, String currentPort) {
            this.vehicleName = vehicleName;
            this.fuelAmount = fuelAmount;
            this.carryingCapability = carryingCapability;
            this.fuelCapability = fuelCapability;
            this.currentPort = currentPort;

        }
        public Vehicle(){

        };



        public String getVehicleName() {
            return vehicleName;
        }

        public void setVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
        }

        public double getFuelAmount() {
            return fuelAmount;
        }

        public void setFuelAmount(double fuelAmount) {
            this.fuelAmount = fuelAmount;
        }

        public double getCarryingCapability() {
            return carryingCapability;
        }

        public void setCarryingCapability(double carryingCapability) {
            this.carryingCapability = carryingCapability;
        }

        public double getFuelCapability() {
            return fuelCapability;
        }

        public void setFuelCapability(double fuelCapability) {
            this.fuelCapability = fuelCapability;
        }

        public String getCurrentPort() {
            return currentPort;
        }

        public void setCurrentPort(String currentPort) {
            this.currentPort = currentPort;
        }
    }



