package com.program.banktransation;

import java.util.Scanner;

public class BankTransation {
	int balance=1000,amount,no,id;
	String s1;
    Scanner s=new Scanner(System.in);
    
    BankTransation(){
    	System.out.println("Enter name: ");
    	s1 = s.nextLine();
    	System.out.println("Enter Id: ");
    	id = s.nextInt();
    }
    public void deposite() {
    		System.out.println("Enter Deposite value: ");
    		amount = s.nextInt();
    		balance = balance+amount;
    				
    }
    protected void withdraw() {
    	if(balance>500) {
    	System.out.println("Enter amount to withdraw: ");
    	no = s.nextInt();
    	if(no%100==0) {
    		balance= balance-no;
    		System.out.println("Your amount: "+no);
    	}
    	else {
    		System.out.println("Not more than!!");
    	}
    }else {
    	System.out.println("Not availble balance");
    }
    }
    public void enquiery() {
    	System.out.println(" name of the person:"+s1);
        System.out.println("person ID:"+id);
        System.out.println("Account Balence:"+balance);
    }
}	
