package nl.hu.practica.les1.practicum1;

public class App4 {
    public static void main(String[] args) {

        for(int i = 0; i <= 39; i++) {
            int result = 1;
            int result2 =  result + ++result;
            System.out.println(result2);
        }
    }
}
