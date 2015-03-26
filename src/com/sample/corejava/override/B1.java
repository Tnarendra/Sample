package com.sample.corejava.override;

class B1 extends Override {
	
	B1 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}
	
	
	int getInt() {
		return super.getInt();
	}
	
	public static void main(String args[]) {
		new B1().get().message();
		System.out.println(new B1().getInt());
	}
}