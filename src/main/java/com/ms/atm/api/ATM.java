package com.ms.atm.api;

public class ATM {

	int note500;
	int note200;
	int note100;
	int note50;
	int note20;
	int note10;
	int note5;

	public ATM(int note500, int note200, int note100, int note50, int note20, int note10, int note5) {
		this.note500 = note500;
		this.note200 = note200;
		this.note100 = note100;
		this.note50 = note50;
		this.note20 = note20;
		this.note10 = note10;
		this.note5 = note5;
	}

	public int getTotalBalance () {
		return this.note500 * 500 +
				this.note200 * 200 +
				this.note100 * 100 +
				this.note50 * 50 +
				this.note20 * 20 +
				this.note10 * 10 +
				this.note5 * 5;
	}

	public int getNote500() {
		return note500;
	}

	public void setNote500(int note500) {
		this.note500 += note500;
	}

	public int getNote200() {
		return note200;
	}

	public void setNote200(int note200) {
		this.note200 += note200;
	}

	public int getNote100() {
		return note100;
	}

	public void setNote100(int note100) {
		this.note100 += note100;
	}

	public int getNote50() {
		return note50;
	}

	public void setNote50(int note50) {
		this.note50 += note50;
	}

	public int getNote20() {
		return note20;
	}

	public void setNote20(int note20) {
		this.note20 += note20;
	}

	public int getNote10() {
		return note10;
	}

	public void setNote10(int note10) {
		this.note10 += note10;
	}

	public int getNote5() {
		return note5;
	}

	public void setNote5(int note5) {
		this.note5 += note5;
	}
}
