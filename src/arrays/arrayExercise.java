package arrays;

public class arrayExercise {
    public static void main(String[] args){
        int[][] arr={{1,4,7},{5,2,2},{5,2,9}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            System.out.println("sum of row "+(i+1)+" is = "+sum);
            sum=0;
        }
        System.out.println(sum);
    }
}
