/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author bhara
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user ID:");
        String userID = scanner.nextLine();
        
        System.out.println("Choose your favorite genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        int genreChoice = scanner.nextInt();
        scanner.nextLine();
        
        while (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid choice. Please choose a valid genre from the list:");
            genreChoice = scanner.nextInt();
            scanner.nextLine();
        }
        String favoriteGenre = genres[genreChoice - 1];
        
        UserProfile newUserProfile = new UserProfile(userID, favoriteGenre);
        System.out.println("Your user profile was created successfully!");
        System.out.println("User ID: " + newUserProfile.getUserID());
        System.out.println("Favorite Genre: " + newUserProfile.getGenre());
        
        scanner.close();
    }
}
