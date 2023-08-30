package Model;

public class Port {
        private String ID;
        private Truck truck;
        private Ship ship;
        private String portName;
        private double latitude;
        private double longitude;
        private double storingCapability;
        private double landingCapability;
        private String Marked;

        public  Port(){
        };

        public Port(String ID){
        };
        public Port(String ID,Truck truck, Ship ship, String portName, double latitude, double longtitude, double storingCapability,
                    double landingCapability, String Marked) {
            this.ID = ID;
            this.truck = truck;
            this.ship = ship;
            this.portName = portName;
            this.latitude = latitude;
            this.longitude = longtitude;
            this.storingCapability = storingCapability;
            this.landingCapability = landingCapability;
            this.Marked = Marked;
        }




        public String getID() {
            return ID;
        }

        public Ship getShip() {
            return ship;
        }

        public void setShip(Ship ship) {
            this.ship = ship;
        }

        public Truck getTruck() {
            return truck;
        }

        public void setTruck(Truck truck) {
            this.truck = truck;
        }

        public String getPortName() {
            return portName;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public double getStoringCapability() {
            return storingCapability;
        }

        public double getLandingCapability() {
            return landingCapability;
        }

        public String getMarked() {
            return Marked;
        }



    }

