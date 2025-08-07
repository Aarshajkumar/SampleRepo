package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingtException {
		// TODO Auto-generated method stub
		int age =15;
		if(age>=18)
		{
			System.out.println("Eligivle to vote");
		}
		else {
			throw new VotingtException("age under 18");
		}
			}
	}


