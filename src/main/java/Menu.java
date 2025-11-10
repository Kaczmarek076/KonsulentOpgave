import java.util.*;

public class Menu {

    Scanner input = new Scanner(System.in);
    String[] menuList = {
            "1 to creat a profile",
            "2 to create a project",
            "3 to search for a expertisen",
            "4 to create a report",
            "-1 to terminate the program"};


    public void printMenu() {

        makeMenu(menuList);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                System.out.printf("You selected %s\n", menuList[0]);
                SubMenuProfile subMenuProfile = new SubMenuProfile();
                subMenuProfile.subMenuForCreateProfile();
                break;
            case 2:
                System.out.printf("You selected %s\n", menuList[1]);
                SubMenuProject subMenuProject = new SubMenuProject();
                subMenuProject.subMenuForCreateProject();
                break;
            case 3:
                System.out.printf("You selected %s\n", menuList[2]);
                break;
            case 4:
                System.out.printf("You selected %s\n", menuList[3]);
                SubMenuReport subMenuReport = new SubMenuReport();
                subMenuReport.subMenuForCreateReport();
                break;
            default:
                System.out.println("Progam terminated");
                break;
        }
    }


    public void makeMenu(String[] menuList) {

        String repaetn = "---".repeat(12);

        System.out.println("Menu selcetion");
        System.out.println(repaetn);
        for (String name : menuList) {
            System.out.printf("Press %s\n", name);
        }
        System.out.printf(repaetn, "\n");
    }
}