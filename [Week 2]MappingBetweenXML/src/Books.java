
public class Books {
	private String bookID;
    private String bookName;
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + "]";
	}
    
}
