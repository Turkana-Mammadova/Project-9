package technoStudy.proje9.Data;

import java.util.LinkedHashMap;

public class StudentData {

    /*
       Dont change this class

       In this map
       Key is the username
       Value is the password

       While checking user name and password  exist or not ,use AddUserNameAndPassword method

    */
    private static LinkedHashMap<String ,String> UsernameAndPassword = new LinkedHashMap<>();

    private StudentData(){}

    public static LinkedHashMap<String,String > AddUserNameAndPassword(){
        UsernameAndPassword.put("Emily","EM12.");
        UsernameAndPassword.put("Adam","AdamApple12");
        UsernameAndPassword.put("Lallana","MidCentral");
        UsernameAndPassword.put("Origiii","CornerTakenQuickly");
        UsernameAndPassword.put("Gerard","Captain2005");
        UsernameAndPassword.put("Mo Salah","KingMo11");
        UsernameAndPassword.put("VanDijk","Defend04");
        UsernameAndPassword.put("Handerson","Champ2019");
        UsernameAndPassword.put("Mane","No10");
        UsernameAndPassword.put("Allison","GoldGloveNo1");

        return UsernameAndPassword;
    }
  
}
