import java.util.Scanner;

public class SubMenuProject {
    Menu createMenu = new Menu();
    Scanner input = new Scanner(System.in);

    String[] createProjectSubMenu = {
            "1 Creating a new Project",
            "-1 to go back",};


    public void subMenuForCreateProject() {

        makeMenu(createProjectSubMenu);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                createProject();
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


    public void createProject() {

        input.nextLine();

        System.out.println("Enter the project id");
        int projectId = input.nextInt();
        input.nextLine();

        System.out.println("Enter Project name: ");
        String projectName = input.nextLine();

        System.out.println("Enter the customers name");
        String projectCustomer = input.nextLine();

        System.out.println("Enter the amount of time used on the project (in hours)");
        int projectTime = input.nextInt();
        input.nextLine();

        System.out.println("Enter the employee name that worked on the Project");
        String projectEmployee = input.nextLine();

        System.out.println("Enter the project category");
        String projectCategory = input.nextLine();

        InsertProject app = new InsertProject();
        app.insertProject(projectName, projectCustomer, projectTime, projectCategory, projectEmployee, projectId);
        continueMenu();

    }





    public void continueMenu() {

        System.out.println("Press 1 to create another Project");
        System.out.println("Press -1 to go back to main menu");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                createProject();
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
