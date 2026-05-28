import java.util.Scanner;
public class Quizarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String [] Questions = {
            "1. Who is the founder of CEAT",
            "2. Why crows dont fart",
            "3. In which year did perfumes invented "
         };

         String [][] options = {
            {"A. Arnold , B.Virat , C.ElonMustard, D.Indiu"},
            {"A. Small Ass, B.Much Hair , C.Low belly pressure , D"},
            {"A. 1998 , B. 2021 , C. 1233 , D. 2023"}
         };

         String [] answers = {
            "C","C","B"
         };

         int score = 0 ;

         for (int i=0 ; i < Questions.length ; i++ ){
            System.out.println("/n"+Questions);

         }
    }
}