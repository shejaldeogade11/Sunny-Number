import java.util.Scanner;


//sunny number means the number next to the number is having square root eg.3, 3+1=4 its means is sunny number
public class SunnyNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        int n = num+1 ;
        boolean flag=false;
        for(int i=1;i<=n;i++){
            if(i*i == n){
            flag=true;
            System.out.println(num+" Is sunny number");
            break;
            }
        }
        if(flag == false)
        System.out.println(num+" Is not sunny number");
       
    }
}