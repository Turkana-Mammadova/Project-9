package technoStudy.proje9.Lessons;


import technoStudy.proje9.Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Math extends LessonClass{

    private ArrayList<String> topicList;

    public Math(StudentClass studentClass) {
        super(studentClass);
    }

   @Override
  public ArrayList<String> topics() {

       topicList=new ArrayList<>();
       topicList.add("Place Value");
       topicList.add(" Compare Whole Numbers");
       topicList.add("Represent Decimals");
       topicList.add(" Place Value through Thousandths");
       topicList.add("Multiplication Patterns");


       return topicList;
   }

}
