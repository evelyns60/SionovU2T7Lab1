public class Main {
    public static void main (String[]args){
        String origStr= "Hello how are you today?";
        String str9 = origStr.substring(6,9);
        System.out.println(str9);

        String today = "FRIDAY!";
        String x = today.substring(3, 7).substring(0, 3).substring(1, 3);
        System.out.println(x);


    }
}
