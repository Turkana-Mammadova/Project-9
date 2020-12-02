package technoStudy.proje9.Lessons;

import technoStudy.proje9.Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Chemistry extends LessonClass {

    private ArrayList<String> topicList=new ArrayList<>();

    public Chemistry(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
   public ArrayList<String> topics() {

        topicList.add("Pedagogy");
        topicList.add("Prerequisites");
        topicList.add("Course Offerings");
        topicList.add("Safety");
        topicList.add("General Chemistry");


        return topicList;
    }
}
