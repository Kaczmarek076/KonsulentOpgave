import java.util.Scanner;

public class SubMenuProfile {
    Menu createMenu = new Menu();
    Scanner input = new Scanner(System.in);

    String[] createEmployeeSubMenu = {
            "1 Create new Employee",
            "-1 to go back",};


    public void subMenuForCreateProfile() {

        makeMenu(createEmployeeSubMenu);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                createEmployee();
                break;
            case -1:
                returnToMainMenu();
                break;

        }
    }


    public void makeMenu(String[] reportSubMenu) {

        String repaetn = "---".repeat(12);

        System.out.println(repaetn);
        for (String name : reportSubMenu) {
            System.out.printf("Press %s\n", name);
        }
        System.out.printf(repaetn, "\n");

    }


    public void createEmployee() {

        input.nextLine();
        System.out.println("Enter Your full Name: ");
        String name = input.nextLine();

        System.out.println("Enter the deparment you work for");
        String department = input.nextLine();

        System.out.println("Enter your given company id");
        int id = input.nextInt();

        insertEmployee app = new insertEmployee();
        app.insertEmployee(name, department, id);
        continueMenu();

    }


    public void continueMenu() {

        System.out.println("Press 1 to create another Employee");
        System.out.println("Press -1 to go back to main menu");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                createEmployee();
                break;
            case -1:
                returnToMainMenu();
                break;
        }

    }




    public void returnToMainMenu() {
        createMenu.printMenu();
    }
}

