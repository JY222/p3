// 3. Write  a  program  that  displays  all  the  numbers  from  100to  200, ten  numbers  per  line,
// that are divisible by 5 or 6, but not both. Numbers are separated by exactly one space.

public class p3 {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while (num <= 200 ) {
            if( (num%5 == 0) || (num%6 == 0) ) {
                System.out.print(num + " ");
                ++count;
                if(count%10 == 0) {
                    System.out.print("\n");

                }

            }
            ++num;
        }
    }
}
