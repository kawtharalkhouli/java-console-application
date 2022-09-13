
package password;
public class AlphabetSelection {
    //Creating Final variables so that there values cannot be modified
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBERS = "1234567890";
	public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
	
	private final StringBuilder pool; //since it wasn't assigned a value this means that it can only be assigned via the class's constructor


	public AlphabetSelection(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {
		
		pool = new StringBuilder();//Creating a string builder to create mutable aka modifable strings
		
		if (uppercaseIncluded) pool.append(UPPERCASE_LETTERS);
		
		if (lowercaseIncluded) pool.append(LOWERCASE_LETTERS);
		
		if (numbersIncluded) pool.append(NUMBERS);
		
		if (specialCharactersIncluded) pool.append(SYMBOLS);
		
	}
	
	public String getAlphabet() {
		return pool.toString();
	}
}

 

