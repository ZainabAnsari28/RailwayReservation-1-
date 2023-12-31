package com.RailwayReservationPaymentService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class PaymentDetails {

	@NotNull
	@Size(min = 16, max = 16, message = "Card Number should of 16 digits")
	private String cardNo;

	@Id
	@NotNull
	private long pnrNo;

	@NotNull
	@Max(value = 999, message = "CVV cannot exceed 3 digits")
	private int cvv;

	@NotNull
	private String bankName;
	 


//	@NotNull
//	private String classType;

	

	public PaymentDetails() {
		super();
	}

	public PaymentDetails(String cardNo, long pnrNo, int cvv, String bankNamet) {
		super();
		this.cardNo = cardNo;
		this.pnrNo = pnrNo;
		this.cvv = cvv;
		this.bankName = bankName;
	//	this.payment=payment;
//		this.classType = classType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "PaymentDetails [cardNo=" + cardNo + ", pnrNo=" + pnrNo + ", cvv=" + cvv + ", bankName=" + bankName
				+  "]";
	}

//	public String getClassType() {
//		return classType;
//	}
//
//	public void setClassType(String classType) {
//		this.classType = classType;
//	}

	
}