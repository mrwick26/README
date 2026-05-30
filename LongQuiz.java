public class LongQuiz {

    public static void main(String[] args) {
        
        //byte x = 5;
        //byte y = 10;
        //byte z = x + y; error
        //int z = x + y;
        //short z = x + y; error
        //long z = x + y;
        //double z = x + y;
        //boolean z = x + y; error

        //System.out.println(z);

        /*int x = 0;
        while(x++ < 10) {}
        String message = x > 10 ? "Greater than" : false;
        System.out.println(message+","+x);*/

        /*long x = 10;
        long y = 2 * x;

        System.out.println(y);*/

        /*java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for(int x : list) {
        System.out.print(x + ", ");
        break;
        }*/

        /*int x = 4;
        long y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        else System.out.println("Too High");*/

        //int x = 5;
        //System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

        /*boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);*/

        /*for(int i=0; i<10 ; i++) {
        //i = i++;
        //System.out.println(i);
        System.out.println("Hello World");
        }*/

        /*byte a = 40, b = 50;
        byte sum = (byte) a + b;
        System.out.println(sum);*/

        //int x = 5 * 4 % 3;
        //System.out.println(x);

        /*int x = 0;
        String s = null;
        if(x == s) System.out.println("Success");
        else System.out.println("Failure");*/

        /*int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        System.out.println(b);
        if(b == true) System.out.println("Success");
        else System.out.println("Failure");*/

        /*int c = 7;
        int result = 4;
        result = ++c;
        System.out.println(result);*/

        /*int x = 1, y = 15;
        while x < 10
        y––;
        x++;
        System.out.println(x+", "+y);*/

        /*do {
        int y = 1;
        System.out.print(y++ + " ");
        } while(y <= 10);*/

       // int i = 10;
       // i--;

boolean keepGoing = true;
int result = 15, i = 10;
do {
i--;
System.out.println(i);
/*if(i==8) keepGoing = false;
result -= 2;*/
System.out.println(result);
break;
} while(keepGoing);
System.out.println(result);


    }
    
}
