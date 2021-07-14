package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.TruckDao;
import entity.Truck;

public class Menu {

	private TruckDao truckDao = new TruckDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display all trucks", 
			"Create a truck", 
			"Update a truck", 
			"Delete a truck");
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
				if (selection.equals("1")) {
					displayAllTrucks();
				} else if (selection.equals("2")) {
					createTruck();
				} else if (selection.equals("3")) {
					updateTruck();
				} else if (selection.equals("4")) {
					deleteTruck();
				}				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("Press enter to continue....");
			scanner.nextLine();
		} while (!selection.equals("-1"));
	}
	
	private void printMenu() {
		System.out.println("Select an Option:\n-------------------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ") " + options.get(i));
		}
	}
	
	private void displayAllTrucks() throws SQLException {
		List<Truck> trucks = truckDao.getTrucks();
		for (Truck truck : trucks) {
			System.out.println(truck.getId() + ": " + truck.getMake() + ": " + truck.getModel() + ": " + truck.getPrice());
		}

	}
	

	private void createTruck() throws SQLException {
		System.out.print("Enter new truck make, model, and price.");
		System.out.println(" First, enter the make: ");
		String make = scanner.nextLine();
		
		System.out.println("Enter the model:  ");
		String model = scanner.nextLine();
		
		System.out.println("Enter the price: ");
		Double price = scanner.nextDouble();
		truckDao.createNewTruck(make, model, price);
	}
	
	private void updateTruck() throws SQLException {
		System.out.println("Enter the truck id to update the truck: ");
		int id = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Update the truck's make: ");
		String make = scanner.nextLine();
		
		System.out.println("Update the truck's model:  ");
		String model = scanner.nextLine();
		
		System.out.println("Update the truck's price: ");
		Double price = scanner.nextDouble();
		truckDao.updateTruck(make, model, price, id);
		
	}
	
	private void deleteTruck() throws SQLException {
		System.out.print("Enter truck id to delete:");
		int id = Integer.parseInt(scanner.nextLine());
		truckDao.deleteTruck(id);
	}

}
