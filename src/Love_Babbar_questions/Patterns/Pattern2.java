package Love_Babbar_questions.Patterns;

public class Pattern2 {
    public static void main(String[]args){
    for (int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if((i==4&&j==2)||(i==4&&j==3)||(i==3&&j==2)){
                System.out.print("  ");
            }
            else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
    System.out.println();
        System.out.println();
        System.out.println();
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
}
}
