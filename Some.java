import java.util.Random;
import java.util.Scanner;

public class Some {

    public void cicle()
    {
        Random rd = new Random();

        int[] kek = {1,2,3,4,5,6,7,8};
        int n = 0;
        //  System.in.read(n);

        int sum =0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
        for(int  i: arr){
            sum= sum+ i;

        }
        System.out.println("for");
        System.out.println(sum);
        int counter = 0;
        sum=0;
        System.out.println("while");
        while(counter<9){
            counter++;
            sum = sum+arr[counter];

        }

        sum =0;
        counter =0;
        do
        {
            counter++;
            sum= sum+arr[counter];
        } while(counter<9);
        System.out.println("do while");
        System.out.println(sum);

    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    static void randsort(){
        Random rd = new Random();
        int[] arr = new int[10];
        int low= 0;
        int high = arr.length-1;
        System.out.println("rand elements");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("sorted");
        quickSort(arr,low,high);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static int Fact(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double summ = sum(n);

        System.out.println("sum");
        System.out.println(summ);
    }


    static double sum(int n)
    {   double s = 0.0;
        double i, summ = 0.0;
        for (i = 1; i < n; i++) {

            System.out.println(1/i);
            summ = summ + 1 / i;

        }
        return summ;
    }

}
