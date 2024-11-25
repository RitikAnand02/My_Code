package com.nit.hk.user;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nit.hk.customexception.InsufficientFundsException;
import com.nit.hk.customexception.InvalidAmountException;
import com.nit.hk.pojo.BankAccountDetails;
import com.nit.hk.spec.BankAccount;

public class Bank {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter BankAccount Name: ");
			String bankName = scn.nextLine();

			try {
				// load and instantiate given class
				Class<?> cls = Class.forName(bankName);
				Object obj = cls.newInstance();

				BankAccount account = (BankAccount) obj;

				BankAccountDetails accDetails = new BankAccountDetails();
				System.out.print("Enter account number: ");
				accDetails.setAccNum(scn.nextLong());
				scn.nextLine();

				System.out.print("Enter account Holder Name");
				accDetails.setAccHName(scn.nextLine());

				System.out.print("Enter balnce: ");
				accDetails.setBalance(scn.nextDouble());
				scn.nextLine();

				account.init(accDetails);
				System.out.println("Start transactions");

				loop: while (true) {
					System.out.println("\nChoose option: ");
					System.out.println(" 1. Deposit");
					System.out.println(" 2. Withdraw");
					System.out.println(" 3. Balance Enquiry");
					System.out.println(" 4. transfer money");
					System.out.println(" 5. Exit");

					System.out.print("Enter option number: ");
					int option = scn.nextInt();
					scn.nextLine();

					switch (option) {
					case 1: {
						while (true) {
							try {
								System.out.print("\nEnter amount to deposit: ");
								double amt = scn.nextDouble();
								scn.nextLine();

								account.deposit(amt);
								System.out.println(amt + " deposited successfully");
								break;
							} catch (InputMismatchException e) {
								System.out.println("Error: Enter only number");
								scn.nextLine();
							} catch (InvalidAmountException e) {
								System.out.println("Error: " + e.getMessage());
							}
						} // while close
						break;
					} // case 1 close

					case 2: {
						while (true) {
							try {
								System.out.print("\nEnter amout to withdraw: ");
								double amt = scn.nextDouble();
								scn.nextLine();

								account.withdraw(amt);
								System.out.println("Collect Your Cash");
								break;
							} catch (InputMismatchException e) {
								System.out.println("Error: Enter only number");
								scn.nextLine();
							} catch (InvalidAmountException e) {
								System.out.println("Error: " + e.getMessage());
							} catch (InsufficientFundsException e) {
								System.out.println("Error: " + e.getMessage());
							}
						} // while close

						break;
					} // case 2 close

					case 3: {
						System.out.print("Current Balance: ");
						account.currentBalance();
						break;
					}
					case 4: {
						System.out.println("Enter account destination details ");
						try {
							System.out.println("Enter destination account name: ");
							
							Class class2 = Class.forName(scn.next());
							Object obj2 = class2.newInstance();
							BankAccount destAcc = (BankAccount)obj2;
							
							BankAccountDetails destAccDetails = new BankAccountDetails();
							System.out.print("Enter account number: ");
							destAccDetails.setAccNum(scn.nextLong());
							scn.nextLine();

							System.out.print("Enter account Holder Name");
							destAccDetails.setAccHName(scn.nextLine());

							System.out.print("Enter balnce: ");
							destAccDetails.setBalance(scn.nextDouble());
							scn.nextLine();

							destAcc.init(accDetails);
							
							System.out.println("Enter amount to transfer: ");
							account.transferMoney(destAcc, scn.nextDouble()); scn.nextLine();

							System.out.println("source account current balance");
							account.currentBalance();
							
							System.out.println("dest account current balance");
							destAcc.currentBalance();
							break;
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
					case 5: {
						System.out.println("***** Thank You, Visit Again *****");
						break loop;
					}
					default: {
						System.out.println("Invalid option, choose correct option");
					}

					}// switch close

				} // while(true) close

			} // outer try close
			catch (ClassNotFoundException e) {
				System.out.println(bankName + ".class file is not available");
			} catch (InstantiationException e) {
				System.out.println(bankName + " class does not contain no-param constructor");
			} catch (IllegalAccessException e) {
				System.out.println(bankName + " class does not contain visible no-param constructor");
			} catch (ClassCastException e) {
				System.out.println("Invalid card");
			}
		} // while outer loop close
		
	}
}
