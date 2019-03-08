/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Harry_Liwayan
 */
public class TestUserProfile 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String userGenre = "", name = "";
        
        
        System.out.println("Please enter your name");
        name = sc.nextLine();
        
        System.out.println("Please choose a genre from the following: Comedy, Drama, Action, Mystery");
        userGenre = sc.nextLine();
        
        UserProfile user = new UserProfile(userGenre, name);
        
        System.out.println("Your user profile has been seuccessfully created.");
        System.out.println("Genre: " + user.getUserID() + " " + "Name: " + user.getGenre());
        
        
        
        
    }
    
}
