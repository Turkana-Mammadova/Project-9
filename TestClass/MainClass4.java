package technoStudy.proje9.TestClass;

import technoStudy.proje9.Lessons.LessonClass;
import technoStudy.proje9.Lessons.Music;
import technoStudy.proje9.Student.StudentClass;

public class MainClass4 {
    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("David", "Villa","England" );

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*

        Run the MainClass4

        Result should be
         Exception in thread "main" java.lang.AssertionError: Not able to find a username and password. Please sign up to website

         */
    }
}




