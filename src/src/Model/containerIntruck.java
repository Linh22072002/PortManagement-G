package Model;

public class containerIntruck  {
        private String truckID;
        private String containerID;
        public containerIntruck(String truckID, String containerID){
            this.truckID = truckID;
            this.containerID = containerID;
        }

        @Override
        public String toString() {
            return "containerIntruck{" +
                    "truckID='" + truckID + '\'' +
                    ", containerID='" + containerID + '\'' +
                    '}';
        }
    }



