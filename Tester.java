/*
 * @author XXXXX08
 *
 * @version 1.0 09/06/2020
 *
 * Title: Best Friend Array Tester
 *
 * Semester: Fall 2020
 *
 * Lecturer's Name: C. Charters
 */

package BestFriendDatabase;
 
import BestFriendDatabase.BestFriend;
import BestFriendDatabase.Helper;
import java.util.Scanner;

/**
 *
 * @author XXXXX08
 * 
 */

public class Tester {


    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
       
         String firstName;
         String lastName;
         String nickName; 
         String cellPhone;
         String email;
         int mainMenu;
         int subMenu;
         BestFriend bfObject;
         
        Helper bestfObj = new Helper();
         
             do 
            {
                mainMenu = printMenu();

             switch (mainMenu) 
            {
    
    /* User will be prompted to add best friend's information if they press "1". */
                 
                case 1:
                    
                    System.out.println("\nAdd a best friend as a contact");
                    
                    System.out.println("Please enter first name: ");
                    
                    key.nextLine();
                    
                    firstName = key.nextLine();

                    System.out.println("Please enter last name:");
                    
                    lastName = key.nextLine();

                    System.out.println("Please enter nickname:");
                    
                    nickName = key.nextLine();

                    System.out.println("Please enter phone number:");
                    
                    cellPhone = key.nextLine();                    

                    System.out.println("Please enter email address:");
                    
                    email = key.nextLine();
                    
                    bfObject = new BestFriend(firstName, lastName, nickName, cellPhone, email);
                    
                    bestfObj.addArray(bfObject);
                    
                    break;
                    
                    
                /* User will be prompted to change best friend's information if they press "2". */   
                    
                case 2:
                    
                    System.out.println("\nChange besst friend's contact info");
                    
                    System.out.println("Please enter first name:");
                    
                    key.nextLine();
                    
                    firstName = key.next();
                    
                    System.out.println("Pleas enter last name:");
                  
                    lastName = key.next();
                    
                    System.out.println("Please enter nickname:");
                    
                    nickName = key.next();
                    
                    System.out.println("Please enter phone number:");
                    
                    cellPhone = key.next();
                    
                    email = "";
                    
                    bestfObj.changeArray(firstName, lastName, nickName, cellPhone, email);
                    
                    break;
                
                 /* User will be prompted to remove best friend's information if they press "3". */
                
                case 3: 
                   
                    System.out.println("\nRemove best friend's contact info");
                    
                    System.out.println("Please enter first name:");
                   
                    key.nextLine();
                    
                    firstName = key.next();
                    
                    System.out.println("Please enter last name:");
                    
                    lastName = key.next();
                    
                    System.out.println("Please enter nickname:");
                    
                    nickName = key.next();
                    
                    bestfObj.removeArray(firstName, lastName, nickName);
                    
                    break;
               
                /* User will be given the option to view the main menu vs. sub menu.*/
                
                case 4:
                
                    do{
                    
                        System.out.println("1. View full contact list \n2. view a best friend");
                    
                        subMenu = key.nextInt();
                        
                    }while (subMenu != 1 && subMenu != 2);
                    
                    if (subMenu == 1){
                    
                        bestfObj.list();
                    
                    }else if(subMenu == 2){
                    
                    System.out.println("\nView a specific best friend's info");
                    
                    System.out.println("Please enter first name:");
                    
                    key.nextLine();
                    
                    firstName = key.next();
                    
                    System.out.println("Please enter last name:");
                    
                    lastName = key.next();
                    
                    System.out.println("Please enter nickname:");
                    
                    nickName = key.next();
                    
                    bestfObj.inquireArray(firstName, lastName, nickName);
                    }

                    break;
               
                    /* User will be exited from the program if they press "5". */
                
                case 5:
                
                    System.out.println("This program will now end. Goodbye.");
                    
                    break; 
                
                default:
                
                    System.out.println("Selection was invalid. Please choose an option from 1 through 5.");
             }
            
            }while (mainMenu != 5);
         
    }
        public static int printMenu() 
    {
        int Menu;
        
        System.out.println("\nMENU");
        System.out.println("1. Add a Friend");
        System.out.println("2. Change a Friend");
        System.out.println("3. Remove a Friend");
        System.out.println("4. View Friends");
        System.out.println("5. Exit\n");
        
        System.out.println("Please choose an option:");
        Menu = key.nextInt();
        return Menu;
        
    }
    
}
