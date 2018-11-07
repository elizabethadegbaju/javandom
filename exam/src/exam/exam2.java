/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Adeotun
 */

class BankAccount{
    String name;
    String accNum;
    float balance;
    void create(String x, String y, float z){
        this.name = x;
        this.accNum = y;
        this.balance = z;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Account Number:"+this.accNum);
        System.out.println("Balance:"+this.balance);
    }
    void deposit(float x){
        this.balance+=x;
    }
    void withdraw(float x){
        this.balance-=x;
    }
}
public class exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount mine = new BankAccount();
        mine.create("Ade","2174935757",3500);
        mine.display();
        mine.deposit(4000);
        mine.display();
        mine.withdraw(6500);
        mine.display();
    }
    
}
