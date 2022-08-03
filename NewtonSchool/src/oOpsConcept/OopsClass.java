package oOpsConcept;
class Car{
	int capacity;
	String model;
	char carType;
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public int getCapacity() {
		return this.capacity;
	}
	
	public void print() {
		System.out.println(this.model+" car having Capacity is "+this.capacity+" and type of the car code is --> "+this.carType);
	}
	//Default Consyructor
	Car(){
		
	}
	//Copy Constructor
	Car(Car cc){
		this.capacity=cc.capacity;
		this.carType=cc.carType;
		this.model=cc.model;
	}
}

public class OopsClass {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.capacity=7;
		car1.carType='T';
		car1.model="Verna";
		
		//car1.print();
		Car car2=new Car(car1);
		car2.print();
	}

}
