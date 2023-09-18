package newPack;
import java.util.*;


public class PlayerRating {

	float averageRating;
	char category;
	
	public char calculateCategory() {
		if(averageRating>8) {
			category = 'A';
		}else if(averageRating>5 && averageRating<=8) {
			category = 'B';
		}else if(averageRating>0 && averageRating<=5) {
			category = 'C';
		}
		return category;
	}
	
	public char calculatRating(float one, float two) {
		averageRating = (one+two)/2 ;
		category = calculateCategory();
		
		return category; 
	}
	
	public char calculatRating(float one, float two, float three) {
		averageRating = (one+two+three)/3 ;
		category = calculateCategory();
		
		return category; 
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id1, id2;
		String name1, name2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID 1: ");
		id1 =  sc.nextInt();
		System.out.println("Enter name 1: ");
		name1 =  sc.nextLine();
		name1 =  sc.nextLine();
		
		PlayerRating obj = new PlayerRating();
		System.out.println("First Average cateogry: "+obj.calculatRating(9, (float) 9.9));
		
		System.out.println("Enter ID 2: ");
		id2 =  sc.nextInt();
		System.out.println("Enter name 2: ");
		name2 =  sc.nextLine();
		name2 =  sc.nextLine();

		
		System.out.println("Second Average cateogry: "+obj.calculatRating(1, 1, 1));
		
		
		
	}

}
