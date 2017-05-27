package com.teja;

public class Main {

    public static void main(String[] args) {
	// write your code here


bank teja = new bank(12345,50000,"teja","12334@gmsil.com",87678767);
teja.deposit(20000);
teja.withdrawl(2000);

System.out.println(teja.getAccountnumber());
        System.out.println(teja.getBalance());
        System.out.println(teja.getCustname());
        System.out.println(teja.getEmail());
        System.out.println(teja.getPhno());
    }
}
