public class help {
    public static void main(String args[]) throws java.io.IOException{
        System.out.println("Справка:\n1. if\n2. switch\nВыберите:");
        char choice;
        choice = (char) System.in.read();
        switch (choice){
            case '1' -> System.out.println("Вы выбрали if. Справку мне лень писать поэтому пупупу папапа");
            case '2' -> System.out.println("Вы выбрали switch. Справку мне лень писать поэтому пам пам пам бадум батссс");
            default -> System.out.println("Ваш выбор не соответсвует цифрам");
                

        }
    }
}
