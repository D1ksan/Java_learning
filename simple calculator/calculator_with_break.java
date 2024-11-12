public class calculator_with_break {
    public static void main(String args[]) throws java.io.IOException{
        for (;(char) System.in.read() != 'Q';){
            System.out.println("Введите через Enter два числа, на выходе получите 4 алгебраической операции с ними");
            double a,b;
            a =  System.in.read();
            b =  System.in.read();
            System.out.println(a+b);
        }

    }
}
