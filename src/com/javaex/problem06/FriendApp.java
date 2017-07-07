package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");

		// 친구정보 입력받기
		
		
		String person01 = sc.nextLine();
		
		String person02 = sc.nextLine();
		
		String person03 = sc.nextLine();

		// 입력받은 친구정보를 공백으로 분리

		// Friend 객체 생성하여 데이터 넣기
		
		String[] info1 = person01.split("\\s");
		String[] info2 = person02.split("\\s");
		String[] info3 = person03.split("\\s");

		Friend f01 = new Friend();
		Friend f02 = new Friend();
		Friend f03 = new Friend();

		f01.setInfo(info1[0], info1[1], info1[2]);
		f02.setInfo(info2[0], info2[1], info2[2]);
		f03.setInfo(info3[0], info3[1], info3[2]);

		// 배열에 추가하기
		friendArray[0] = f01;
		friendArray[1] = f02;
		friendArray[2] = f03;

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {

			friendArray[i].showInfo();

		}

		sc.close();
	}

}
