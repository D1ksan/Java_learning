public class input_S {
    public static void main(String args[])throws java.io.IOException{
        System.out.println("Для остановки введите букву S");
        int i;
        for (i=0; (char) System.in.read() != 'S'; i++){
            System.out.println("Проход"+i);
        }
    }
}
