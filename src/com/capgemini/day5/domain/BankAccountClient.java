package com.capgemini.day5.domain;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.day5.domain.BankAccount;
import com.capgemini.day5.domain.DebitCard;
import com.capgemini.day5.exception.InvalidPinException;
import com.capgemini.day5.exception.LowBalanceException;

public class BankAccountClient
{
public static void main(String[] args) {
		
		DebitCard debitCard = new DebitCard(2222333344445555L, 342, 1234, 01, 2021);
		BankAccount account = new BankAccount(9087, "John Doe", "SAVING", 25000, debitCard);
		
		int pin;
		double amount;
		int choice;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter your pin = ");
			pin = scanner.nextInt();
			if(debitCard.validatePin(pin)) {
				System.out.println("1. Withdraw\n2. Deposit\n3. Check balance\n4. Exit"); 
				System.out.print("Please enter yout choice = ");
				choice = scanner.nextInt();
				switch(choice) {
					case 1: System.out.print("Please enter an amount = ");
							   amount = scanner.nextDouble();
							   account.withdraw(amount);
							   System.out.println("Your current balance: " + account.getBalance());
							   break;
					case 2: System.out.print("Please enter an amount = ");
					            amount = scanner.nextDouble();
					            account.deposit(amount);	
					            System.out.println("Your current balance: " + account.getBalance());
					            break;
					case 3: System.out.println("Your current balance: " + account.getBalance());
					            break;
					case 4: System.exit(0);     				
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please provide valid input");
		}
		catch(InvalidPinException | LowBalanceException e) {
			System.out.println(e.getMessage());
		}
}
}
