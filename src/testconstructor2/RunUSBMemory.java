package testconstructor2;

public class RunUSBMemory {

	public static void main(String[] args) {
		USBmemory u1=new USBmemory(64, "Black");
		USBmemory u2=new USBmemory(128, "Red");
		
		u1.readMemory();
		
		u2.writeMemory();
		u2.readMemory();

	}

}
