package Model;

import java.util.Arrays;
import java.util.Scanner;

    public class Truck extends Vehicle{

        private String truckID;
        private String truckType;
        private int typeInfor;
        private int numCons;
        private Container[] containers;

        public Truck(){};
        public Truck(String truckID){};
        public Truck (String truckID, String truckType,int typeInfor, int numCons, String vehicleName, double fuelAmount,
                      double carryingCapability, double fuelCapability, String currentPort) {
            super(vehicleName, fuelAmount, carryingCapability, fuelCapability,currentPort);
            this.truckID = truckID;
            this.truckType = truckType;
            this.numCons = numCons;
            this.typeInfor = typeInfor;
            containers = new Container[numCons];
        }

        public Truck(Model.Truck truck) {
        }
        public void load(int numCons) { // Ham nay de load container
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adding a new container....");
            System.out.println("Enter the container ID: ");
            String containerID = scanner.next();
            Container container = new Container(containerID);
            containers[numCons] = new Container(container);

        }


        public void loadCons(int numCons){ // ham nay de check ( check typetruck and check typecons) va sau do load container
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adding infoTruckType...");
            System.out.println("Enter the infoTruckType: ");
            int infoTruckType = scanner.nextInt();
            System.out.println("Enter the infoConType: ");
            String infoContype = scanner.next();
            switch (infoTruckType) {
                case 1: if(infoTruckType == 1 && (infoContype.equals("dry")|| infoContype.equals("top")|| infoContype.equals("side") )){
                    load(numCons);
                    break;
                };
                case 2: if( infoTruckType == 2 && infoContype.equals("refrigerated")){
                    load(numCons);
                    break;
                };
                case 3: if(infoTruckType == 3 && infoContype.equals("liquid")){
                    load(numCons);
                    break;
                };
                default:
                    System.out.println("Cons type and trucks type not matching");

            }

        }



        @Override
        public String toString() {
            return "Truck{" +
                    "containers=" + Arrays.toString(containers) +
                    '}';
        }
        public void display(){
            for (Container rc: containers
            ) {
                System.out.println(rc);

            }
        }

        public static void main(String[] args) {
            Model.Truck truck1 = new Model.Truck("t1", "basic", 1, 3, "truck", 22, 22, 22, "L");
            for (int i = 0; i < 3; i++) {
                truck1.loadCons(i);
            }




        }

        public String getTruckID() {
            return truckID;
        }
        public void setTruckID(String truckID) {
            this.truckID = truckID;
        }

        public String getTruckType() {
            return truckType;
        }

        public void setTruckType(String truckType) {
            this.truckType = truckType;
        }
    }

