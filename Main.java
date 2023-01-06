public class Quiz {
       private int id;
       private Student student;
       private int totalScore;
       private int maxScore;

   public Quiz(int id, Student student, int totalScore, int maxScore) {
       this.id = id;
       this. student = student;
       this. totalScore = totalScore;
       this. maxScore = maxScore;
   }

   public double grade() {
      return (double) ((this.totalScore*100) / this.maxScore);
  }

   public static void main(String[] arg) {
         // create a new student 
         Student student = new Student("Donita");
         System.out.println(student.getName());

         int totalScore = 0;
         int maxScore = 0;
   
        // create a new quiz for the student
         Quiz quiz1 = new Quiz(1, student, 20, 20);
         totalScore += quiz1.totalScore;
         maxScore += quiz1.maxScore;
         System.out.println("Quiz 1 Score: "+quiz1.totalScore);
         
        // create a another quiz for the student
         Quiz quiz1 = new Quiz(2, student, 17, 20);
         totalScore += quiz1.totalScore;
         maxScore += quiz1.maxScore;
         System.out.println("Quiz 2 Score: "+quiz1.totalScore);

        // print the student's total grade on all quizzes
           duoble totalGrade = ((double) totalScore / maxScore)*100;
           System.out.println("\nTotal grade: " + totalGrade);

   }
}





