package arrays;

public class Exercisetwo {
    public static void main(String[] args){
        int[][] arr={{1,0,333,8},{29,12,6,7},{5,2,111,4}};
        for(int i=0;i<3;i++){
            int sum=arr[i][0];
            for(int j=0;j<4;j++){
                 if(arr[i][j]>sum){
                    sum=arr[i][j];
                }
            }
            System.out.println("max of row "+(i+1)+" is "+sum);
        }
        System.out.println(arr[0][1]);
        Project obj=new Project();
        obj.method1();
        Project.method2();
        obj.method2();
        System.out.println(args);
    }
}
