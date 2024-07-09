package com.main;

import java.util.List;
import java.util.Scanner;

import com.CakeShopManagement.Cake;
import com.dao.AdminDAO;
import com.dao.CakeDAO;

public class CakeshopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminDAO adminDAO = new AdminDAO();
        CakeDAO cakeDAO = new CakeDAO();

        System.out.println("Welcome to the Cake Shop Management System");
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (adminDAO.authenticate(username, password)) {
            System.out.println("Login successful!");

            while (true) {
                System.out.println("\n1. Add Cake");
                System.out.println("2. View Cakes");
                System.out.println("3. Update Cake");
                System.out.println("4. Delete Cake");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter cake name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter cake price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter cake quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        cakeDAO.addCake(new Cake(0, name, price, quantity));
                        System.out.println("Cake added successfully!");
                        break;
                    case 2:
                        List<Cake> cakes = cakeDAO.getAllCakes();
                        System.out.println("ID\tName\tPrice\tQuantity");
                        for (Cake cake : cakes) {
                            System.out.println(cake.getId() + "\t" + cake.getName() + "\t" + cake.getPrice() + "\t" + cake.getQuantity());
                        }
                        break;
                    case 3:
                        System.out.print("Enter cake ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new price: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        cakeDAO.updateCake(new Cake(updateId, newName, newPrice, newQuantity));
                        System.out.println("Cake updated successfully!");
                        break;
                    case 4:
                        System.out.print("Enter cake ID to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        cakeDAO.deleteCake(deleteId);
                        System.out.println("Cake deleted successfully!");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid username or password.");
            scanner.close();
        }
    }
}
