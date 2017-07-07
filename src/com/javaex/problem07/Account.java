package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
        this.accountNo = accountNo; 
    	System.out.println(accountNo + "계좌가 계설되었습니다.");
    }
    
    //필요한 메소드 작성
  
    
    public void deposit(int balance) {
    	
    	this.balance = this.balance + balance;
    	
    }
    
    public void withdraw(int balance) {
    	
    	this.balance = this.balance - balance;
    	
    }
    
    public void showBalance() {
    	
    	System.out.println(balance + "원");
    	
    }
    
    

}
