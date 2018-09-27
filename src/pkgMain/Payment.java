package pkgMain;

import java.lang.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Payment {
	
//declare variables Car cost, down payment, length of loan (in months), interest rate for loan
// and loan amount 
	int CarCost;
	int DownPayment;
	int LengthInMonths;
	double InterestRate;
	int LoanAmount;

	public Payment(int carcost, int downpayment, int lengthinmonths, double interestrate, int loanamount) {
		
		this.CarCost = carcost;
		this.DownPayment = downpayment;
		this.LengthInMonths = lengthinmonths;
		this.InterestRate = interestrate;
		this.LoanAmount = loanamount;
	}
	
	public int getCarCost() {
		return CarCost;
	}

	public void setCC(int carcost) {
		CarCost = carcost;
	}

	public int getDownPayment() {
		return DownPayment;
	}

	public void setDownPayment(int downpayment) {
		DownPayment = downpayment;
	}
	
	public int getLengthInMonths() {
		return LengthInMonths;
	}

	public void setLengthInMonths(int lengthinmonths) {
		LengthInMonths = lengthinmonths;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestrate) {
		InterestRate = interestrate;
	}


	public int getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(int loanamount) {
		LoanAmount = loanamount;
	}

	public double MonthlyPay() {
		return CarCost / LengthInMonths;
	}


	public double Rate() {
		return InterestRate / 1200;
	}
	public String TIOL() { 
		//Total spent on interest over the term of the loan.
			return String.format("%.2f",( CarCost * Rate() * (Math.pow(1+Rate(), LengthInMonths))) / (Math.pow(1+Rate(), LengthInMonths) - 1));
		}
}

