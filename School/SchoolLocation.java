package technoStudy.proje9.School;

import java.util.ArrayList;

public class SchoolLocation {

    private String price;
    private String location;
    private static ArrayList<String>locationList;


    public SchoolLocation(String location) {
        this.location = location;
        addLocation();
        setSchoolLocation(this.location);
        setPrice(this.location);
    }

    public void setLocation(String location) { //lazimmi deyilmi emin deyilem
        this.location = location;
    }


    public void setPrice(String location)throws RuntimeException  {
       switch (location){
           case "USA":      price+=8000;break;
           case "England":  price+=6500;break;
           case "France":   price+=7200;break;
           case "Germany":  price+=7000;break;
           case "Canada":   price+=7500;break;
           default: throw new RuntimeException("This is not a valid location");
       }
    }

    public String getPrice() {
        return price;
    }

    public static void addLocation(){
       locationList=new ArrayList<>();
        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");
    }


    public static ArrayList<String> getLocationList() {
        return locationList;
    }

    public void setSchoolLocation(String SchoolLocation) throws RuntimeException{
        ArrayList<String > listOfLocations=getLocationList();
        if(listOfLocations.contains(SchoolLocation)){
            location=SchoolLocation;
        }else {
            throw new RuntimeException ("Location should be one of the following " +listOfLocations);

        }
    }
    public String getLocation() {
        return location;
    }
}
