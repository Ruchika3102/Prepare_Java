public class PrintAllCharacters {
    public static void main(String args[]){
        String str = "Hello, World!";
        for(int i = 0; i < str.length(); i++){
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }
    }
}
