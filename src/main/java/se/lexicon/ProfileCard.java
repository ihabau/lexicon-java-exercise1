package se.lexicon;

public class ProfileCard {

    public static void main(String[] args) {

        // when running main.java this function is skipped
        String name = "sofia";
        int age = 22;
        String city = "stockholm";
        String devider = "====================";
        String proile =  "==== MY PROFILE ====";

        IO.println(devider);
        IO.println(proile);
        IO.println(devider);
        IO.println("Name: " + name);
        IO.println("Age: " + age);
        IO.println("City: " + city);
        IO.println(devider);

    }

    public class profileCardClass {

        // addding static makes the class callable
        public static void printCard(String name,int age, String city) {
            String devider = "====================";
            String proile =  "==== MY PROFILE ====";

            IO.println(devider);
            IO.println(proile);
            IO.println(devider);
            IO.println("Name: " + name);
            IO.println("Age: " + age);
            IO.println("City: " + city);
            IO.println(devider);
        }
    }


}
