package Model;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Truck extends Vehicle{

    private String truckID;
    private String truckType;
    private int typeInfor;
    private Container[] containers;

    public Truck(){};
    public Truck(String truckID){};
    public Truck (String truckID, String truckType,int typeInfor, String vehicleName, double fuelAmount,
                  double carryingCapability, double fuelCapability, String currentPort) {
        super(vehicleName, fuelAmount, carryingCapability, fuelCapability,currentPort);
        this.truckID = truckID;
        this.truckType = truckType;
        this.typeInfor = typeInfor;

    }

    public Truck(Truck truck) {
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
                "truckID='" + truckID + '\'' +
                ", truckType='" + truckType + '\'' +
                ", typeInfor=" + typeInfor +
                ", vehicleName=" + getVehicleName()+
                ", fuelAmount=" + getFuelAmount()+
                ", carryingCapability=" + getCarryingCapability()+
                ", fuelCapability=" + getFuelCapability()+
                '}';
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

    public int getTypeInfor() {
        return typeInfor;
    }

    public void setTypeInfor(int typeInfor) {
        this.typeInfor = typeInfor;
    }

}

