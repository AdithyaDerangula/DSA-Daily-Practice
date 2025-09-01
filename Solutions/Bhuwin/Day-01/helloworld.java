import java.util.*;

public class helloworld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int res = sum(n);

        System.out.println(res);


}
public static int sum(int i) {
    if(i==0){
        return 0;
    }

    return i+sum(i-1);


   


}
}