import java.util.*;
public class Sumofeven{
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);{
           int sum=0;
           int num=2;
           while(num<=100){
            sum += num;
            num += 2;
           } 
           System.out.println("The sum of all even numbers b/w 1 and 100 are: "+sum);
           src.close();
        }
    }
}

