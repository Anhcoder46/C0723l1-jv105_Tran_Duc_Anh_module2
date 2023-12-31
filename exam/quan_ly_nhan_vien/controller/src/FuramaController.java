public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        int choice;
        do {
            System.out.println("<---------FURAMA RESORT---------->");
            System.out.println("MENU: " +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n6. Exit" +
                    "\n Enter your choice...");
            choice = getUserChoice(1, 6);
            switch (choice) {
                case 1:
                    employeeController();
                    break;
                case 2:
                    customerController();
                    break;
                case 3:
                    facilityController();
                    break;
                case 4:
                    bookingController();
                    break;
                case 5:
                    promotionController();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        } while (true);
    }

    private static void employeeController() {
        EmployeeService employeeService = new EmployeeService();
        int choice;
        do {
            System.out.println("Enter the next selection :  " +
                    "\n1. Display list employees" +
                    "\n2. Add new employee" +
                    "\n3. Edit employee" +
                    "\n4. Return main menu" +
                    "\n Enter your choice...");
            choice = getUserChoice(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Display list employees function: ");
                    employeeService.displayList();
                    break;
                case 2:
                    System.out.println("Add new employee function: ");
                    employeeService.add();
                    break;
                case 3:
                    System.out.println("Edit employee function: ");
                    employeeService.edit();
                    break;
                case 4:
                    return;
            }

        } while (true);
    }

    private static void customerController() {
        CustomerService customerService = new CustomerService();
        int choice;
        do {
            System.out.println("Enter the next selection :  " +
                    "\n1. Display list customers" +
                    "\n2. Add new custonmer" +
                    "\n3. Edit customer" +
                    "\n4. Return main menu" +
                    "\n Enter your choice...");
            choice = getUserChoice(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Display list customers function: ");
                    customerService.displayList();
                    break;
                case 2:
                    System.out.println("Add new customer function: ");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("Edit customer function: ");
                    customerService.edit();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    private static void facilityController() {
        FacilityService facilityService = new FacilityService();
        int choice;
        do {
            System.out.println("Enter the next selection :  " +
                    "\n1. Display list facility" +
                    "\n2. Add new facility" +
                    "\n3. Display list facility maintenance" +
                    "\n4. Return main menu" +
                    "\n Enter your choice...");
            choice = getUserChoice(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Display list facility function: ");
                    facilityService.displayList();
                    break;
                case 2:
                    System.out.println("Add new facility function: ");
                    facilityService.add();
                    break;
                case 3:
                    System.out.println("Display list facility maintenance function: ");
                    facilityService.displayListMaintenance();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    private static void bookingController() {
        BookingService bookingService = new BookingService();
        int choice;
        do {
            System.out.println("Enter the next selection :  " +
                    "\n1. Add new booking" +
                    "\n2. Display list booking" +
                    "\n3. Create new contracts" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu" +
                    "\n Enter your choice...");
            choice = getUserChoice(1, 6);
            switch (choice) {
                case 1:
                    System.out.println("Add new booking function: ");
                    bookingService.add();
                    break;
                case 2:
                    System.out.println("Display list booking function: ");
                    bookingService.displayList();
                    break;
                case 3:
                    System.out.println("Create new contracts function: ");
                    bookingService.createNewContract();
                    break;
                case 4:
                    System.out.println("Display list contracts function: ");
                    bookingService.displayListContract();
                    break;
                case 5:
                    System.out.println("Edit contracts function: ");
                    bookingService.editContract();
                    break;
                case 6:
                    return;
            }

        } while (true);
    }

    private static void promotionController() {
        PromotionService promotionService = new PromotionService();
        int choice;
        do {
            System.out.println("Select option:" +
                    "\n1. Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu" +
                    "\n Enter your choice...");
            choice = getUserChoice(1, 3);
            switch (choice) {
                case 1:
                    System.out.println("Display list customers use service function: ");
                    promotionService.getListCustomerUseService();
                    break;
                case 2:
                    System.out.println("Display list customers get voucher function: ");
                    promotionService.displayGetVoucher();
                    break;
                case 3:
                    return;
            }
        } while (choice != 4);
    }

    public static int getUserChoice(int min, int max) {
        int choice;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < min || choice > max) {
                    System.out.println("Please enter a number between " + min + " and " + max + " !!!");
                } else {
                    return choice;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number between " + min + " and " + max + " !!!");
            }
        } while (true);
    }
}
