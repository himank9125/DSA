package classnObject;
class Vehicle{
	String vehicleName="THAR";
	int vehicleNo=4;
	char colorCode;
	void print() {
		System.out.println("This is Vehicle");
	}
//	Vehicle(String vName,int vNumber,char ccode) {
//		this.vehicleName=vName;
//		this.vehicleNo=vNumber;
//		this.colorCode=ccode;
//	}
	
	
}
class Maruti extends Vehicle{
	String model;
	int vehicleNo;
	int PassCap;
//	super.vehicleName="THAR";
	void print2() {
		super.print();
	}
	
	void print() {
		System.out.println("This is Maruti and my parent is "+super.vehicleName);
	}
}

public class ClassPoliMorphism {

	public static void main(String[] args) {
		Vehicle mr=new Maruti();
		
		//mr.vehicleNo=2;
		mr.print();
		//mr.print2();
		System.out.println(mr.vehicleNo);
		// TODO Auto-generated method stub
		
		Maruti ms=new Maruti();
		ms.vehicleName="Mahindra";
		ms.model="wagonR";
		ms.print2();
//		Vehicle vh=new Vehicle("Scarpio",2,'B');
//		System.out.print(vh.vehicleNo);

	}

}
