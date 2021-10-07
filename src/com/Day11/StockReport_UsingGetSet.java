package com.Day11;

/*
* probel no 1 to get stock report
* probel no 2 to withdraw money from account
*
*of day 11&12
*
* */
import java.util.Scanner;

public class StockReport_UsingGetSet {
    static String stockName;
    static int stockPrice;
    static int stockQuantity;
    static int balance = stockPrice * stockQuantity;
    static Scanner sc = new Scanner(System.in);

    static StockReport_UsingGetSet stock = new StockReport_UsingGetSet();

    public static void main(String[] args) {
       menu();
    }

    /*get values*/
    public String getStockName() {
        return stockName;
    }
    public int getStockPrice() {
        return stockPrice;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    /*set values*/
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public void setStockPrice(int stockPrice) {this.stockPrice = stockPrice;}
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String toString() {
        return "stock report is as follows" + "\nstock name " + stockName +
                "\nstock price " + stockPrice + "\nquantity " + stockQuantity +
                "\ntotal value " + (stockPrice * stockQuantity) + " " + "\n";

    }
    public static void menu(){
        System.out.println("enter choice" + "\n 1.get stock report" + "\n2.withdraw amount"+"\n3.add money");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                stock.stockReport();
                menu();
            case 2:
                stock.debit();
                menu();
            case 3:
                System.out.println("enter amount to add");
                balance += sc.nextInt();
                System.out.println("amount is added succesfully,your balance is "+balance);
                menu();
        }
    }


    static void stockReport() {
        System.out.println("enter stock name");
        stock.setStockName(sc.next());

        System.out.println("enter stock price");
        stock.setStockPrice(sc.nextInt());

        System.out.println("enter stock quantity");
        stock.setStockQuantity(sc.nextInt());

        System.out.println(stock.toString());
        balance = stockPrice * stockQuantity;
    }
    static void debit() {
        int amount = 0;
        System.out.println("enter amount to withdraw");
        amount = sc.nextInt();
        if (balance == 0) {
            System.out.println("Your baalance is 0 rs. first add stocks or balance to account then try withdraw");
        }
        else {
            if (amount < balance) {
                balance = balance - amount;
                System.out.println("withdrawl succesfull " + "\nremaining balance is " + balance);
            } else {
                System.out.println("withdrawl amount is greater than balance");
            }
        }
    }
}
