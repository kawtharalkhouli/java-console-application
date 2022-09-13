
package password;

import java.util.Scanner;

public class Password {
public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Random generator = new Random(keyboard);
        generator.mainLoop();
        keyboard.close();
    }

    
}
