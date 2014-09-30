import java.util.Objects;
import java.util.Scanner;

public class CheckDigit {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your credit card number as a long integer "
				+ "(without spaces or hypens):");
		long creditCardNumber = input.nextLong();
		input.close();
		
		String creditCard = Objects.toString(creditCardNumber);
		
		if(isValid(total) == true){
			System.out.println("This credit card number is valid");
		}
		else
			System.out.println("This credit card number is invalid");
	}
	
	public ing evenNumberSum(long number){
		//sum even spaces 
		int evenSum = 0;
		
		for(int i = 0; i <= 15; i+=2){
			evenSum += creditCard;
		}		
	}
	

	public int oddNumberSum(long number){
		//multiply odd space digits by 2 then sum
		long oddSum = 0;
		for (int i = 1; i <= 15; i+=2){
			oddSum += creditCard;
		}
	}
	
	public long total(oddSum, evenSum){
		long total = oddSum + evenSum;
	}
	
	public boolean isValid(long total){
		if(total % 10 == 0)
			return true;
		else
			return false;
	}	

}
