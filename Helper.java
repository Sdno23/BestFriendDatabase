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

package bestfrienddatabase;

import bestfrienddatabase.BestFriend;

/**
 *
 * @author XXXXX08
 * 
 */
 
public class Helper {
    
    public BestFriend[] Besties;
    public int currentSize;

    public Helper() {
        
        Besties = new BestFriend[10];
        
        currentSize = 0;
    }    
    
/**
    Using the addArray() method, user will be able to add BFF's contact info as an array.
**/

    public void addArray(BestFriend aFriend) {
        
        if (currentSize < Besties.length) {

            Besties[currentSize] = aFriend;
            
            currentSize++;
        
        } else {

            BestFriend[] newBestie = new BestFriend[Besties.length * 2];
     
            for (int i = 0; i < Besties.length; i++) {

                newBestie[i] = Besties[i];
            }
            
            Besties = newBestie;
            
            Besties[currentSize] = aFriend;
            
            currentSize++;
        }
    }
    
/**
    Using the changeArray() method, users will be able to update contact info within the array.
**/ 
    
    public void changeArray(String firstName, String lastName, String nickName, String cellPhone, String email) {

        boolean found = false;
        int i = 0;
        
        while (!found && i < currentSize)
        {
            if (Besties[i].getFirstName().equalsIgnoreCase(firstName) && (Besties[i].getLastName().equalsIgnoreCase(lastName)&& Besties[i].getNickName().equalsIgnoreCase(nickName)))
            {
                found = true;               
                Besties[i].setCellPhone(cellPhone);
                System.out.println("Best ffriend's info was successfully changed.");
            }
            i++;
        }
        
        if (!found)
        {
            System.out.println("Best friend not found.");
        }
   
    }
/**
   Using the removeArray() method, users will be able to remove contact info within the array.
  
     * @param firstName
     * @param lastName
     * @param nickName
**/ 

    public void removeArray(String firstName, String lastName, String nickName) {
    
        boolean found = false;
        int i = 0;
        
        while (!found && i < currentSize)
        {
            if (Besties[i].getFirstName().equalsIgnoreCase(firstName) && (Besties[i].getLastName().equalsIgnoreCase(lastName)&& Besties[i].getNickName().equalsIgnoreCase(nickName)))
            {
                for (int j = i; j < currentSize; j++){
                
                    Besties[j] = Besties[j+1];
                }
                Besties[currentSize - 1] = null;
                currentSize--;
                found = true;
                System.out.println("Best firend's info succesfully removed.");
            }
            i++;
        }
        
        if (!found)
        {
            System.out.println("Best friend not found.");
        }
   
        
    }
/**
  Using the inquireArray() method, users will be able to view specific info within the array.

     * @param firstName
     * @param lastName
     * @param nickName
**/
     
    public void inquireArray(String firstName, String lastName, String nickName) {
        
        boolean found = false;
        int i = 0;
        
        while (!found && i < currentSize)
        {
            if (Besties[i].getFirstName().equalsIgnoreCase(firstName) && (Besties[i].getLastName().equalsIgnoreCase(lastName)&& Besties[i].getNickName().equalsIgnoreCase(nickName)))
            {
                System.out.println("Information found!");
                System.out.println("First name: " + Besties[i].getFirstName() + "\nLast name: " + Besties[i].getLastName() + "\nNickname: " 
                        + Besties[i].getNickName() + "\nCell Phone: " + Besties[i].getCellPhone() + "\nEmail: " + Besties[i].getEmail());
                found = true;
            }
            i++;
        }
        
        if (!found)
        {
            System.out.println("Best friend not found.");
        }
    }
/**
     Using the list() method, users will be able to print the array.
**/  
    public void list(){
   
   int j = 0;
   
       System.out.println("");
       
       for(int i = 0; i < currentSize;i++){
       
        System.out.println("First name: " + Besties[i].getFirstName() + "\nLast name: " + Besties[i].getLastName() + "\nNickname: " + 
                Besties[i].getNickName() + "\nCell Phone: " + Besties[i].getCellPhone() + "\nEmail: " + Besties[i].getEmail());
           
            System.out.println("End of best friend's contact info. " + (j + 1) + "\n");
           
               j++;
       }
   }

}
