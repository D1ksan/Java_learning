import java.util.Random;

public class guess_symbol {
    public static void main(String args[]) throws java.io.IOException{
        Random random = new Random();
        char ch, answer;
        answer = (char) ('A'+ random.nextInt(26));
        System.out.println(answer); //для быстрого теста работы программы
        System.out.println("Угадайте букву от A до Z которую я загадал: (после ввода нажмите Enter) ");
        ch = (char) System.in.read();
        if (ch == answer){
            System.out.println("Вы угадали! Поздравляем!!!");
        }
        else {
            System.out.println("К сожалению, вы не угадали, попробуйте еще!");
            if (ch<answer) System.out.println("Буква ближе к концу алфавита");
            else System.out.println("Буква ближе к началу алфавита");
        }
    }
}
