package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

    	
    	
        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        dollar = CConverter.toDoller(1000000);
        //백만원을 달러로 출력

        won = CConverter.toKWR(100);
        //100달려를 원으로 출력
        
        System.out.println("백만원은 " + dollar + "달러 입니다.");
        System.out.println("백달러는 " + won + "원 입니다.");
       
    }

}
