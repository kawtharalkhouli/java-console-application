
package password;

public class StrengthCheck {
    //A strength check is based on two attributes the string containing the password and the length of the password
   String Value;
    int Length;
    
    public StrengthCheck(String s) {
        Value = s;
        Length = s.length();
    }
    //checking what values are used within the password
    public int CharType(char C) {
        int val;

        // Char is Uppercase Letter
        if ((int) C >= 65 && (int) C <= 90)
            val = 1;

        // Char is Lowercase Letter
        else if ((int) C >= 97 && (int) C <= 122) {
            val = 2;
        }

        // Char is Digit
        else if ((int) C >= 60 && (int) C <= 71) {
            val = 3;
        }

        // Char is Symbol
        else {
            val = 4;
        }

        return val;
    }
//Calculating the score of the password to check its' strength
    public int PasswordStrength() {
        String s = this.Value;
        boolean UsedUpper = false;
        boolean UsedLower = false;
        boolean UsedNum = false;
        boolean UsedSym = false;
        int type;
        int Score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            type = CharType(c);

            if (type == 1) UsedUpper = true;
            if (type == 2) UsedLower = true;
            if (type == 3) UsedNum = true;
            if (type == 4) UsedSym = true;
        }

        if (UsedUpper) Score += 1;
        if (UsedLower) Score += 1;
        if (UsedNum) Score += 1;
        if (UsedSym) Score += 1;

        if (s.length() >= 8) Score += 1;
        if (s.length() >= 16) Score += 1;

        return Score;
    }
//Displaying results based on the score
    public String calculateScore() {
        int Score = this.PasswordStrength();

        if (Score == 6) {
            return "Your Password's Strength is Very Good ";
        } else if (Score >= 4) {
            return "Your Password's Strength is Good ";
        } else if (Score >= 3) {
            return "Your Password's Strength is Medium";
        } else {
            return "Your Password's Strength is Weak";
        }
    }

    @Override
    public String toString() {
        return Value;
    }
}
