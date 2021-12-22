package com.program.comparable;

import java.util.Objects;

public class Books implements Comparable<Books> {

	private String bookName;
	private String noOfPages;
	private String bookAuthor;
	private String bookPrise;
	@Override
	public int compareTo(Books o) {
		// TODO Auto-generated method stub
		return o.bookAuthor.compareTo(bookAuthor);
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(String noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPrise() {
		return bookPrise;
	}
	public void setBookPrise(String bookPrise) {
		this.bookPrise = bookPrise;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookName, bookPrise, noOfPages);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && Objects.equals(bookName, other.bookName)
				&& Objects.equals(bookPrise, other.bookPrise) && Objects.equals(noOfPages, other.noOfPages);
	}
	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", noOfPages=" + noOfPages + ", bookAuthor=" + bookAuthor
				+ ", bookPrise=" + bookPrise + "]";
	}
	
	
}
