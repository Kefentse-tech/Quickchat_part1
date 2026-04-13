/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Quickchat_part1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
 class login {
String storeUsername;
    String storePassword;
    String storephoneNumber;
   
    
    //Method to check username
    public boolean checkUsername (String username) {
       if(username.length()<=5 && username.contains("_")){
           System.out.println("username sucessfully captured");
           System.out.println("Welcome<user first name>,<userlast name> it is great to see you again");
           return true ;
       } else {
           System.out.println("username is not correctly formatted please ensure that your user name containand underscore and is");
           System.out.println("username incorrect, please try again");
           return false ;
       }
       
    }
    
    
    //Method to check password complexity
    public boolean checkPasswordComplexity (String password){
        boolean haveLength= password.length()>=8 ;
        boolean haveUppercase= password.matches (".*[A-Z].*");
        boolean haveNumbers= password.matches (".*[0-9].*");
        boolean haveSpecialCharacters=password.chars(). anyMatch(c-> !Character.isLetter(c));
        
        if (haveLength && haveUppercase && haveNumbers && haveSpecialCharacters){
            return true;
        }else{
        return false;
        }
    }
    
    
    //Cell PhoneNumber
    public boolean checkphoneNumber (String phoneNumber){
        if(phoneNumber.length()== 11 && phoneNumber.startsWith("+27") && phoneNumber.matches (".*[0-9].*")); {
     return true;
    }
     
             
     } 

    
// we are creating the registeruser method so the user can enter the required registration
 void registerUser(){
 
 Scanner input =new Scanner (System.in);
System.out.println("\n========REGISTER========");
     System.out.println("Enter Username: ");
     String username = input.nextLine();
     
     System.out.println("Enter Password: ");
     String password = input.nextLine();
     
     System.out.println("Enter phoneNumber: ");
     String phoneNumber = input.nextLine();
     
     storeUsername= username;
     storePassword= password;
     storephoneNumber= phoneNumber;
             
     if (checkUsername(username)&& checkPasswordComplexity(password)&& checkphoneNumber(phoneNumber)){
         System.out.println("successful registration");
     } else{
         System.out.println("failed registration");
     }
        
    }
 
   //we are creating a userlogin Method
    void userlogin () {
        
        
        Scanner input =new Scanner (System.in);
        System.out.println("\n========login========");
     System.out.println("Enter username: ");
     String username = input.nextLine();
     
     System.out.println("Enter password: ");
     String password = input.nextLine();
     
     System.out.println("Enter phoneNumber: ");
     String phoneNumber = input.nextLine();
     
     storeUsername= username;
     storePassword= password;
     storephoneNumber= phoneNumber;
             
     if (checkUsername(storeUsername)&& checkPasswordComplexity(storePassword)&& checkphoneNumber(storephoneNumber)){
         System.out.println("login successful");
     } else{
         System.out.println("login failed");
     }
        
    }
    
    //Method to check if the username,the password,and the cellphonenumber are correct
    public String registerUser (String Username, String password, String phoneNumber){
        boolean haveUsername= checkUsername (Username);
        boolean havePassword= checkPasswordComplexity (password);
        boolean haveNumber= checkphoneNumber (phoneNumber);
        
         if (!haveUsername){
             return "Incorrect Username";
         }
         if (!havePassword){
             return "Incorrect password";
         }
         if (!haveNumber){
             return "Incorrect number";
         }
         return "Username, Password, and CellPhoneNumber is correct";
    }
         
     // Logging in the user if the username and the password match the new password
     public boolean loginUser (String Username, String password,String newUsername, String newPassword){
         boolean correctLogin= newUsername.equals (Username)&& newPassword.equals (password);
         {
             return correctLogin;
         }
     }
     //What the app will show when the user either has correct login details or not 
     public String returnLoginStatus(String username,String password, String newUsername, String newPassword){
         if (loginUser(username, password, newUsername, newPassword)){
             return "Correct login";
         }else{
             return "Incorrect username or password";
         }
     }

}
public class Quickchat_part1{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner enterMenu = new Scanner (System.in) ;
        // it is where the user can choose if they want to register , Loginor want to go to the menu 
        login loginapp=new login();
        int choice;
        do {
            System.out.println("\n=====MENU=====");
            System.out.println("1.Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
              System.out.println("enter Menu Option");
             choice= enterMenu.nextInt();
             switch (choice ){
                 case 1:
                     loginapp.registerUser();
                     break;
                 case 2:
                     loginapp.userlogin();
                     break;
                 case 3:
                     System.out.println("goodbye");
                     break;
                 default:
                     System.out.println("invalid choice");
             }
        }while (choice!=3);{
             enterMenu.close();
        }
    }
}
        
     
     
     
    
     
     
     
    

