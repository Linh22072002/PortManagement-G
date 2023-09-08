package Model;

    public class TVP {
        String tripID;
        String portID;
        String conID;
        String truckID;
        String shipID;

        public TVP(String portID,String tripID, String truckID, String shipID, String conID) {
            this.tripID = tripID;
            this.portID = portID;
            this.conID = conID;
            this.truckID = truckID;
            this.shipID = shipID;
        }

        public String getTripID() {
            return tripID;
        }

        public void setTripID(String tripID) {
            this.tripID = tripID;
        }

        public String getPortID() {
            return portID;
        }

        public void setPortID(String portID) {
            this.portID = portID;
        }

        public String getConID() {
            return conID;
        }

        public void setConID(String conID) {
            this.conID = conID;
        }

        public String getTruckID() {
            return truckID;
        }

        public void setTruckID(String truckID) {
            this.truckID = truckID;
        }

        public String getShipID() {
            return shipID;
        }

        public void setShipID(String shipID) {
            this.shipID = shipID;
        }

        @Override
        public String toString() {
            return "TVP{" +
                    "portID='" + portID + '\'' +
                    ",tripID='" + tripID + '\'' +
                    ", truckID='" + truckID + '\'' +
                    ", shipID='" + shipID + '\'' +
                    ", conID='" + conID + '\'' +
                    '}';
        }
    }

