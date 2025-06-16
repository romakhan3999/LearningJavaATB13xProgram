package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
//        Web Automation
//        I will ask the user to give me input from browser which he wants to
//        use to I will start the Automation in that browser.

//       String browser = args[0];
//        System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser Name which you want to Start");
        String browser = scanner.next();
        browser  = browser.toLowerCase();

        switch (browser)
        {
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("...........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
//                Further code to start the firefox
//                Webdriver driver = new Firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute The edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");

        }
    }
}
