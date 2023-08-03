package Day1;

public class Occurrenceofaspecificletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="Hello";
		char search='l';
		int count =0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==search) {
				count++;
			}
			
		}
		System.out.println("Thhe Charecter" + search +"appears" + count + "times");
		

	}

}
