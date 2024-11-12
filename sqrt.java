public class sqrt {
    public static void main(String args[]){
        double num, num2;
        int counter = 0;
        for (num=1.0; num<=100.0; num++){
            num2 = Math.sqrt(num);
            System.out.println(num + " " + num2);
            counter++;
        
        if (counter==10){
        System.out.println();
        counter = 0;
        }
    }
}
}
