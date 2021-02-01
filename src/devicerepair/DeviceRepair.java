package devicerepair;

import java.util.*;

public class DeviceRepair {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Device myNewDevice = new Device("IdentificationCode", "MakeAndModel", "owner", "ProblemDescription", "RepairNotes", "priority");
        System.out.println(myNewDevice.toString());

        String deviceID = myNewDevice.toString();

        String[] device = deviceID.split(", "); //splits the long deviceID to seperate sections - delimeter
        System.out.println(device[1]); //prints 2rd decleration (MakeAndModel)

        mainMenu();

    }

    public static void mainMenu() {
        while (true) {
            System.out.println("Please select and option");
            System.out.println("1 - Add a device");
            System.out.println(" 2 - Remove a device");
            System.out.println("3 - Track a device");

            int userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Add a Device");
                    break;
                case 2:
                    System.out.println("Remove a device");
                    break;
                case 3:
                    System.out.println("Track a device");
                    break;
            }

        }
    }
}
