import static JaPy.Print.*;

public class Main {
    public static void main(String[] args){
        printHello();
        String greetings = "Hello, world!";
        print(new String[]{"How","are","you?"});
        Object[] arr = new Object[] {
                new int[]{1,2,3},
                new char[]{'a', 'b', 'c'},
                new String[]{"I","am","good!",":)"}
        };
        print(arr[2],greetings);
    }
}
