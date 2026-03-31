import java.util.Scanner;
public class SumExceptSelf {
        static Scanner sc = new Scanner(System.in);

        public static int[] arrInput(int n){
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                return arr;
        }
        
        public static int[] arrSum(int[] arr, int n){
                int[] res = new int[n];
                int sum = 0;
                for(int i=0; i<arr.length; i++){
                        sum += arr[i];
                }
                for(int i=0; i<arr.length; i++){
                        res[i] += sum - arr[i];
                }
                return res;
        }

        public static void arrOutput(int[] arr){
                for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i]);
                        if(i != (arr.length-1)){
                                System.out.print(" ");
                        }
                }
        }
        // TODO: Read n
        // TODO: Read array elements
        // TODO: Calculate sum of all elements (Total Sum)
        // TODO: For each element, print (Total Sum - element)
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[] nums = arrInput(n);
                int[] output = arrSum(nums, n);
                arrOutput(output);
        }
}
