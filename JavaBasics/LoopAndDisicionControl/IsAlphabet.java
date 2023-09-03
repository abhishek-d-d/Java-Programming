public class IfAlphabet {
	public static void main(String[] args) {
		char c = '*';
		if(c >='a' && c<='z' || c<='Z' && c>='A')
		{
			System.out.println(c+" is an Alphabet. ");
		}
		else
		{
			System.out.println(c+" is not an Alphabet.");
		}
			
	}

}

/*
1:

class Main {
  public static void main(String[] args) {


    char c = 'a';


    if (Character.isAlphabetic(c)) {
      System.out.println(c + " is an alphabet.");
    }
    else {
      System.out.println(c + " is not an alphabet.");
    }
  }
}

2:
public class Alphabet {

    public static void main(String[] args) {

        char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
    }
}
*/
