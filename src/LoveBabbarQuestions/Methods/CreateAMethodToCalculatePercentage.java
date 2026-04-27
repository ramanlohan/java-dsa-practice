package LoveBabbarQuestions.Methods;

public class CreateAMethodToCalculatePercentage {
    public static void main(String[]args){
        double marksObtained=390;
        double totalMarks=500;
       double percent= checkPercent(marksObtained,totalMarks);
       System.out.println(percent);
    }
    public static double checkPercent(double marksObtained,double totalMarks){
        double res=(marksObtained/totalMarks)*100;
        return res;
    }
}
