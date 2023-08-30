package Model;

public class Container{
        private String containerID;
        private float weight;
        private String type;


        public Container(String containerID, float weight, String type){
            this.containerID = containerID;
            this.type = type;
            this.weight = weight;

        }
        public Container(String containerID){
            this.containerID = containerID;
        };

        public Container(Model.Container container) {
        }

        public String getContainerID() {
            return containerID;
        }

        public void setContainerID(String containerID) {
            this.containerID = containerID;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }


