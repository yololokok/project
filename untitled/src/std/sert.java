package std;

import java.util.Scanner;

public class sert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        StringBuffer s1 = new StringBuffer(a);

        for (int i= s1.lastIndexOf(".")-3;i>0;i-=3){
            s1.insert(i,",");
        }
        System.out.println(s1);
    }
}
