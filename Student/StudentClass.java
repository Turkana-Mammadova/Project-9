package technoStudy.proje9.Student;


import technoStudy.proje9.Data.StudentData;
import technoStudy.proje9.School.SchoolLocation;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {

   private String username;
   private String password;
   private LinkedHashMap<String, Integer>classNameAndScore;


    public StudentClass(String username, String password, String studentSchoolLocation) {
        super(studentSchoolLocation);
        this.username = username;
        this.password = password;
        setUsernamePassword(username,password);

    }


    public void setUsernamePassword(String username , String  password)throws RuntimeException{
        LinkedHashMap<String ,String > temp= StudentData.AddUserNameAndPassword();
      if(temp.containsKey(username)) {
             if (temp.get(username).equals(password)) {
              this.username = username;
              this.password = password;
             }else {
              throw new RuntimeException("Not able to find a username and password. Please sign up to website");
             }
      }else {
              throw new RuntimeException("Not able to find a username and password. Please sign up to website");
          }


    }

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Price='" + getPrice() + '\'' +
                ", schoolLocation='" +getLocation() + '\'' +
                ", classNameAndScore=" + classNameAndScore +
                '}';
    }
}
