package package1;

public class StudentDataExtended {
    private String location;

    public void addDetails(String location){
        this.location=location;
    }

    public void printDetails(String id,String name){
        System.out.println(id +
                " " +
                name +
                " " +
                location);
    }
}
