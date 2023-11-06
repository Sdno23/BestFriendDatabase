/*
 * @author XXXXX08
 *
 * @version 1.0 09/06/2020
 *
 * Title: Brst Friend Array Tester
 *
 * Semester: Fall 2020
 *
 * Lecturer's Name: C. Charters
 */

package main;

import java.util.Objects;

/**
 *
 * @author XXXXX08
 */
 
public class BestFriend {
    private String firstName;
    private String lastName;
    private String nickName;
    private String cellPhone;
    private String email;

    public BestFriend(String firstName, String lastName, String nickName, String cellPhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.cellPhone = cellPhone;
        this.email = email;
    }
    
   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BestFriend{" + "firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName + ", cellPhone=" + cellPhone + ", email=" + email + '}';
    }

      
       
   
    
}
