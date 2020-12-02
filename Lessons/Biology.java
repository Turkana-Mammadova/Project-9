package technoStudy.proje9.Lessons;


import technoStudy.proje9.Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Biology extends LessonClass {

    private ArrayList<String> topicList;

    public Biology(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList=new ArrayList<>();
        topicList.add("Ecology");
        topicList.add("Opportunities in Biology");
        topicList.add("Principles of Biology 1");
        topicList.add("Principles of Biology 2");
        topicList.add("Principles of Genetics");


        return topicList;
    }
}
