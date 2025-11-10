import java.util.Scanner;

public class SubMenuReport {
    Menu createMenu = new Menu();
    Scanner input = new Scanner(System.in);

    String[] createProjectSubMenu = {
            "1 Creating a new Report",
            "-1 to go back",};


    public void subMenuForCreateReport() {

        makeMenu(createProjectSubMenu);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                createReport();
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


    public void createReport() {

        ReadAllReports readAllReports = new ReadAllReports();
        readAllReports.ReadReports();

        System.out.println("Using the project id choos one project to print the Report out");
        int userInput  = input.nextInt();



        continueMenu();


    }





    public void continueMenu() {

        System.out.println("Press 1 to create another Report");
        System.out.println("Press -1 to go back to main menu");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                createReport();
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

