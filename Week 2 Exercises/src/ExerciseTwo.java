
public class ExerciseTwo {
	
	public static void main(String[] args) {
		ExerciseTwo e2 = new ExerciseTwo();
		System.out.println(e2.getAlphabetArray());
	}
	
	public char[] getAlphabetArray()
	{
		char[] alphArray = new char[26];
		int index = 0;
		char c = 'a';
		do
		{
			alphArray[index] = c;
			index++;
			c++;
		}while(c <= 'z');
		return alphArray;
	}
}
