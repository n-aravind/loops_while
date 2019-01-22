public class Main {
    public static void main(String[] args) {

        int i =1;

        while (i < 10 ){
            System.out.println("9/" + i + ": Remainder = " + 9 % i + " Dividend = 9 and Quotient = " + 9 / i );
            i++;
        }

        int a=0, b=0, temp=1;
        System.out.print("Fibonacci series up to 10: ");
        do {
            a=b;
            b=temp;
            temp=a+b;
            System.out.print(temp + " ");
            i++;
        }while (i < 20);
    }
}