package Oops;

public class Bankloan_encapsulation {
	private String name;
	private int age;
	private int amount;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		if(age>=18 && age<=50) {
			this.age=age;
		}else {
			System.out.println("invalid");
		}
		
	}
	
	public void setAmount(int amount) {
		if(amount>=1000 && amount<=100000) {
			this.amount=amount;
		}else {
			System.out.println("invalid");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getAmount() {
		return amount;
	}
	
	
	

}
