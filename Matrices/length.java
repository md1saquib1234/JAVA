package Matrices;

public class length {

    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      //  String fullName = "Tony stark";
      //  System.out.println(fullName.length());

        //concatenation
        String firstName = "Shradha";
        String lastName = "khapra";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
       // System.out.println(fullName.charAt(1));

       printLetters(fullName);
    }
}
