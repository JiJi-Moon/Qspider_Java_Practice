import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        String[] arr=input.split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
