package technoStudy.proje9.Lessons;


import technoStudy.proje9.Student.StudentClass;

import java.util.ArrayList;

public class Science extends LessonClass  {
    ArrayList<String> topicList;

    public Science(StudentClass studentClass) {
        super(studentClass);
    }


    @Override
    public ArrayList<String> topics() {
        topicList=new ArrayList<>();
        topicList.add("Animal Habitats");
        topicList.add("Ball Launcher Challenge");
        topicList.add(" Balloon Car");
        topicList.add(" Bending Plant Roots with Gravity");
        topicList.add(" Birthday Season Weather Report");


        return topicList;
    }

}
