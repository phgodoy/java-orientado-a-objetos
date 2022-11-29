/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.banksystemv01;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author laund
 */
public class BankSystemV01 {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
         
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if( response == 'y' ) {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number,holder);
        }
        
        System.out.println();
        System.out.println("Account data : ");
        System.out.println(account);
        //System.out.println(account.toString());
        
        System.out.println();
        System.out.println("Entre a deposit  value : ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);
        
        sc.close();
        }
         
         
   
    
}
