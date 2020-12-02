package technoStudy.proje9.Lessons;


import technoStudy.proje9.Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public abstract class LessonClass {

    /*
         LessonClass class is abstract class

         Create 2 private variables
         1) static int totalCreditCount
         2) LinkedHashMap Key is String, value is Integer, name is classNameAndScore

         one private StudentClass object.

      */
    private static int totalCreditCount;
    private LinkedHashMap<String, Integer> classNameAndScore = new LinkedHashMap<>();
    private StudentClass obj;

    /*
        Create a method name is topics

        This method is a abstract method

        Return type is String ArrayList

     */

    public abstract ArrayList<String> topics();

     /*
    Create a constructor for the LessonClass
    parameter is StudentClass object

    make StudentClass instance variable equal to StudentClass parameter

    call the setCreditCount method  which you are expected to create below
     */

    public LessonClass(StudentClass studentClass) {
        this.obj = studentClass;
        setCreditCount();
    }

    /*
     Create a method name setCreditCount
     No parameter and no return type

     Create an arraylist name is lessonsName
     Ask to user "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"

     If the user took the class then print "You already took this class please choose other class"

     If the user didn't take that class before, then add it to the arraylist, and add the credit of the class
     (which comes from the lessonsName list) to the

     totalCreditCount(you need to use checkCredit method)

     NOTE: The user can add a class until totalCreditCount less than or equals to 10

      */


    public void setCreditCount() {

        ArrayList<String> lessonsName = new ArrayList<>();
        if (totalCreditCount<10) {
            System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");
        }Scanner scanner = new Scanner(System.in);

        while (totalCreditCount <10) {
            String answer = scanner.nextLine();
            if (lessonsName.contains(answer)) {
                System.out.println("You already took this class please choose other class");
            } else {
                lessonsName.add(answer);
                checkCredit(answer);
            }

        }

    }


    /*
   Create a method name is checkCredit
   parameter is one String lessonName
   return type is int

   IF the lessonName = Math
    credit should be 3

    IF the lessonName = Science
    credit should be 4

     IF the lessonName = Biology
    credit should be 2

     IF the lessonName = Chemistry
    credit should be 2

     IF the lessonName = Music
    credit should be 3

    if the class is non of these options
       Throw an exception "You class name is not a valid class name."

   After the every if statement
    put lessonName as a key in the classNameAndScore
    value should take from the next method which is RandomNum

    */
    public int checkCredit(String lessonName) {


        switch (lessonName) {

            case "Math":
                totalCreditCount +=3;classNameAndScore.put(lessonName, RandomNum());break;
            case "Science":
                totalCreditCount += 4;classNameAndScore.put(lessonName, RandomNum());break;
            case "Music":
                totalCreditCount += 3;classNameAndScore.put(lessonName, RandomNum());break;

            case "Biology":
                totalCreditCount += 2;classNameAndScore.put(lessonName, RandomNum());break;
            case "Chemistry":
                totalCreditCount += 2;classNameAndScore.put(lessonName, RandomNum());break;

            default:
                throw new RuntimeException("You class name is not a valid class name.");

        } return totalCreditCount;
    }




    /*
        Create a method name is RandomNum
        no parameter
        Return type is int

        create an int number between 0 to 100
         */
    public int RandomNum() {
        Random random = new Random();
        return random.nextInt(101);
    }


    /*
    Create a get method for the ClassNameAndScore
     */
    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }


}

