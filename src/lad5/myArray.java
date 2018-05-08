package lab5;

public class myAerray {
    public static void main(String[] args) {

        int a [] = new int [5] ;
        System.out.println (a[0]);
        a[0] = 10;
        System.out.println(a[0]);
        // input data array
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nexlnt();
        }

        System.out.println("data in array : ");
        for (int i=0;i<a.length;i++){
            System.out.print (a[i]+"\t");

        }

    }
}