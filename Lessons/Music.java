package technoStudy.proje9.Lessons;

import technoStudy.proje9.Student.StudentClass;

import java.util.ArrayList;

public class Music  extends LessonClass{

   private ArrayList<String> topicList;

    public Music(StudentClass studentClass) {
        super(studentClass);
    }


    @Override
   public ArrayList<String> topics() {
       topicList=new ArrayList<>();
        topicList.add("Peacemaking Skills for Little Kids");
        topicList.add("Learning Through Literature");
        topicList.add("Creative Conflict Solving");
        topicList.add("Creating Peace, Building Community");
        topicList.add("WinWin!");


        return topicList;
    }

}
