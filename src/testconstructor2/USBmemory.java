package testconstructor2;

public class USBmemory {
	
	private int capacity;
	private String color;
	
	public int getCapacity() {
		return capacity;
	}
	public String getColor() {
		return color;
	}
	
	public USBmemory(int capacity, String color) {
		this.capacity=capacity;
		this.color=color;
	}
	
	public String showInfo() {
		return capacity+"GB, "+color+"색상";
	}
	
	public void writeMemory() {
		System.out.println(showInfo()+"의 USB Memory에 데이터 저장");
	}
	
	public void readMemory() {
		System.out.println(showInfo()+"의 USB Memory에 데이터 읽기");
	}
	

}
