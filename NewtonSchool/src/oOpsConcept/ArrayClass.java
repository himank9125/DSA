package oOpsConcept;

import java.util.Scanner;

class ClsArr{
	int x;
	int y;
	//String z;
	public ClsArr(int x, int y) {
		this.x=x;
		this.y=y;
		//this.z=z;
	}
}

public class ArrayClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ClsArr[] arr=new ClsArr[5];
		for(int i=0;i<arr.length;i++) {
			ClsArr clObj=new ClsArr(sc.nextInt(),sc.nextInt());
			arr[i]=clObj;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j].x<arr[j+1].x) {
					ClsArr temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else if(arr[j].x==arr[j+1].x && arr[j].y<arr[j+1].y) {
					ClsArr temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(ClsArr i: arr) {
			System.out.println(i.x+"--->"+i.y);
		}

	}

}
