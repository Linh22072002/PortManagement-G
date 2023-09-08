package Model;

public class containerInShip {
        private String shipID;
        private String containerID;
        public containerInShip(String shipID, String containerID){
            this.shipID = shipID;
            this.containerID = containerID;
        }

        @Override
        public String toString() {
            return "containerInShip{" +
                    "shipID='" + shipID + '\'' +
                    ", containerID='" + containerID + '\'' +
                    '}';
        }
    }

