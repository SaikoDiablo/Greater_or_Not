import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int counter =0;
         
        System.out.println("Before:"+ Arrays.toString(array));
        for (int iteration = 0;iteration<array.length -1;iteration++){
            counter++;

             for(int i =0;i< array.length -1 ; i++){
             counter++;   
             if(array[i] > array[i+1]){
                int temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                counter++;
            }
          }
        }
       
        System.out.println("After:" + Arrays.toString(array));
        System.out.println("Number of actions: " + counter);


    }
}
