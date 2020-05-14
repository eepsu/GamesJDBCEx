package be.belfius.GamesJDBC.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Borrow {
		int borrowId;
		int borrowGameId;
		int borrowerId;
		LocalDate borrowDate;
		LocalDate returnDate;
		public Borrow(int borrowId, int borrowGameId, int borrowerId, LocalDate borrowDate, LocalDate returnDate) {
			super();
			this.borrowId = borrowId;
			this.borrowGameId = borrowGameId;
			this.borrowerId = borrowerId;
			this.borrowDate = borrowDate;
			this.returnDate = returnDate;
		}
		public Borrow() {
			// TODO Auto-generated constructor stub
		}
		public int getBorrowId() {
			return borrowId;
		}
		public void setBorrowId(int borrowId) {
			this.borrowId = borrowId;
		}
		public int getBorrowGameId() {
			return borrowGameId;
		}
		public void setBorrowGameId(int borrowGameId) {
			this.borrowGameId = borrowGameId;
		}
		public int getBorrowerId() {
			return borrowerId;
		}
		public void setBorrowerId(int borrowerId) {
			this.borrowerId = borrowerId;
		}
		public LocalDate getBorrowDate() {
			return borrowDate;
		}
		public void setBorrowDate(LocalDate borrowDate) {
			this.borrowDate = borrowDate;
		}
		public LocalDate getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(LocalDate returnDate) {
			this.returnDate = returnDate;
		}
		@Override
		public String toString() {
			return "Borrow [borrowId=" + borrowId + ", borrowGameId=" + borrowGameId + ", borrowerId=" + borrowerId
					+ ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
		}
		
		
		
		
	}

