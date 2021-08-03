public class Basics{
    public static void main(String[] args){
        int i = 0;
        while(i < 256){
            System.out.println(i);
            i++;
        }

        for(int n = 0; n < 256; n++){
            if(n % 2 != 0) {
                System.out.println(n);
            }
            else{

            }
        }

        int sum = 0;
        for(int j = 0; j < 256; j++) {
            sum += j;
        }
        System.out.println(sum);

        int[] myArray = {1,3,5,7,9,13};
        for(int k = 0; k < myArray.length; k++){
            System.out.println(myArray[k]);
        }
        
        int max = 0;
        int[] arr = {12, -2, -3, 0, 45};
        for(int m = 0; m < arr.length; m++){
            if(max < arr[m]){
                max = arr[m];
            }
        }
        System.out.println(max);

        int[]arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for(int w = 0; w < arr2.length; w++){
            if(arr2[w] % 2 != 0){
                System.out.println(arr2[w]);
            }
        }
        
    }
}