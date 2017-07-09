package com.javaex.problem08;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode; // 대여 유무를 나타내는 상태코드

	// 셍성자

	public Book(int bookNo, String title, String author) {

		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;

	}

	// 메소드

	// setter

	public void boonkNum(int bookNo) {

		this.bookNo = bookNo;

	}

	public void bookTitle(String title) {

		this.title = title;

	}

	public void bookAuthor(String author) {

		this.author = author;
	}

	// getter

	public int boonkNum() {

		return bookNo;

	}

	public String bookTitle() {

		return title;

	}

	public String bookAuthor() {

		return author;
	}

	// 빌림 표시 기능, 프린트 기능
	public void rent() {

		this.stateCode = 0;
		System.out.println(title + "이(가) 대여됐습니다.\n");

	}

	public void print() {

		System.out.print(bookNo + "책 제목:" + title + ", 작가:" + author + ", 대여 유무: ");

		if (stateCode == 0) {
			System.out.println("대여중\n");
		} else {
			System.out.println("재고 있음\n");
		}
	}

}
