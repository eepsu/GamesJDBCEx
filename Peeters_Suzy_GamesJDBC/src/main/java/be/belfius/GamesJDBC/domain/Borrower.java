package be.belfius.GamesJDBC.domain;

public class Borrower {

	int borrowerId;
	String borrowerName;
	String borrowerStreet;
	String borrowerHouseNr;
	String borrowerBusNr;
	int borrowerPostCode;
	String borrowerCity;
	String borrowerTel;
	String borrowerMail;
	
	public Borrower(int borrowerId, String borrowerName, String borrowerStreet, String borrowerHouseNr,
			String borrowerBusNr, int borrowerPostCode, String borrowerCity, String borrowerTel, String borrowerMail) {
		super();
		this.borrowerId = borrowerId;
		this.borrowerName = borrowerName;
		this.borrowerStreet = borrowerStreet;
		this.borrowerHouseNr = borrowerHouseNr;
		this.borrowerBusNr = borrowerBusNr;
		this.borrowerPostCode = borrowerPostCode;
		this.borrowerCity = borrowerCity;
		this.borrowerTel = borrowerTel;
		this.borrowerMail = borrowerMail;
	}
	public Borrower() {
		// TODO Auto-generated constructor stub
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getBorrowerStreet() {
		return borrowerStreet;
	}
	public void setBorrowerStreet(String borrowerStreet) {
		this.borrowerStreet = borrowerStreet;
	}
	public String getBorrowerHouseNr() {
		return borrowerHouseNr;
	}
	public void setBorrowerHouseNr(String borrowerHouseNr) {
		this.borrowerHouseNr = borrowerHouseNr;
	}
	public String getBorrowerBusNr() {
		return borrowerBusNr;
	}
	public void setBorrowerBusNr(String borrowerBusNr) {
		this.borrowerBusNr = borrowerBusNr;
	}
	public int getBorrowerPostCode() {
		return borrowerPostCode;
	}
	public void setBorrowerPostCode(int borrowerPostCode) {
		this.borrowerPostCode = borrowerPostCode;
	}
	public String getBorrowerCity() {
		return borrowerCity;
	}
	public void setBorrowerCity(String borrowerCity) {
		this.borrowerCity = borrowerCity;
	}
	public String getBorrowerTel() {
		return borrowerTel;
	}
	public void setBorrowerTel(String borrowerTel) {
		this.borrowerTel = borrowerTel;
	}
	public String getBorrowerMail() {
		return borrowerMail;
	}
	public void setBorrowerMail(String borrowerMail) {
		this.borrowerMail = borrowerMail;
	}
	@Override
	public String toString() {
		return "Borrower [borrowerId=" + borrowerId + ", borrowerName=" + borrowerName + ", borrowerStreet="
				+ borrowerStreet + ", borrowerHouseNr=" + borrowerHouseNr + ", borrowerBusNr=" + borrowerBusNr
				+ ", borrowerPostCode=" + borrowerPostCode + ", borrowerCity=" + borrowerCity + ", borrowerTel="
				+ borrowerTel + ", borrowerMail=" + borrowerMail + "]";
	}
	
	
	
}


