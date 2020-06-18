
package pilot_01_package_01;
import java.util.Scanner;

public class car {
	public void carstats (String carOwner, int maxSpeed, int distance, int avgSpeed, double avgTime, int fuelcost)
	{
		int a;
		System.out.println("Name of the car's Owner : " + carOwner);
		System.out.println("Max speed travelled today : " + maxSpeed);
		System.out.println("Total distance (KM) travelled today : " + distance);
		System.out.println("Averege Speed (KM/h) travelled today : " + avgSpeed);
		System.out.println("Average Time (h) travelled today : " + avgTime);
		System.out.println("Fuel Cost (BDT) today : " + fuelcost);
		return a;
	}



public static void main(String[] args)
{
	
	
	 	Scanner quavysCar = new Scanner(System.in);
		System.out.println("Enter you name : " );
		String Owner = quavysCar.nextLine();
		
		System.out.println("Enter your max speed : ");
		int Speed = quavysCar.nextInt();
		
		System.out.println("Enter your total distance travelled : ");
		int dist = quavysCar.nextInt();
		
		System.out.println("Enter your average speed : ");
		int avgS = quavysCar.nextInt();
		
		System.out.println("Enter your total time travelled : ");
		double avgT = quavysCar.nextDouble();
		
		int fuel = dist * 85;

		car mycar = new car();			
		mycar.carstats (Owner,Speed,dist,avgS,avgT,fuel);
	}


}

