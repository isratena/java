package dataReader1;
import java.util.Random;

public class RandomNumberManipulation {

	public static void main(String[] args) {
		Random r = new Random(); // random class constructor
		int arr[] = new int[50]; //setting array number 50

		for(int i = 0; i <arr.length; i++){
		   //random numbers from 1 to 10:
		   arr[i] = r.nextInt(500)+1 ; //random number putting into array
		   //System.out.println(arr[i]);
		}
System.out.println("/////////////");
		for(int i = 0; i <50; i++){ // printing only even numbers
			if(arr[i]%2==0)
		   System.out.print(arr[i] + " ");
		}

	}
		
	}
		