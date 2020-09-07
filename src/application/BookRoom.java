package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class BookRoom {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] room = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int rr = sc.nextInt();
								
		for (int i = 0; i < rr; i++ ) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			room[roomNumber] = new Room(roomNumber, name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < room.length; i++) {
			if(room[i] != null) {
				System.out.println(i + ": " + room[i].getStundentName()
									   + ", " + room[i].getStudentEmail());
			}
		}
		
		sc.close();

	}
}
