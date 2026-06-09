package se.lexicon;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
        IO.println("Hello Java!");

        // comments like this same as javascript
        // calling class to print exercise 1
        ProfileCard.profileCardClass.printCard("jorden", 44, "gothenborg");
        ProfileCard.profileCardClass.printCard("Sam", 15, "Malmo");

        // because PrifileCard.main have String[] args in its parameter list we need to pass an empty arg string[]
        // under is 2 ways to call main with an empty string array
        String[] emptyArgs = new String[0]; //create an empty string array
        ProfileCard.main(emptyArgs); // call with main with the empty string array
        ProfileCard.main(new String[]{});   // call main  without assigning an array beforehand

        //find leap year

        LeapYear.findLeapYear();

    }
}
