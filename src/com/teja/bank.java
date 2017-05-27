package com.teja;

/**
 * Created by TEJA on 5/27/2017.
 */
public class bank {

    private int accountnumber;
    private int balance;
    private String custname;
    private String email;
    private int phno;
    public bank(int accountnumber,int balance,String custname,String email,int phno){

        this.accountnumber=accountnumber;
        this.balance=balance;
        this.custname=custname;
        this.email=email;
        this.phno=phno;
    }

    public void deposit(int depositamt)
    {
        this.balance+=depositamt;
        System.out.println("deposit amt is" + depositamt + "remaining balance is" + this.balance);


    }
     public void withdrawl(int withdrawlamt)
     {
         if(this.balance-withdrawlamt<=0)
         {
             System.out.println("only" + this.balance + "available in ur account");
         }
         else
         {
             this.balance-=withdrawlamt;
             System.out.println("withdrawl amt is" + withdrawlamt + "remaining balance" + this.balance);
         }

     }
    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }
}








