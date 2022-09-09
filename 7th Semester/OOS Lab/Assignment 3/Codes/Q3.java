import java.util.ArrayList;
import java.util.Scanner;

class Meeting{
    public String meetingTitle;
    public String meetingDate;
    public String meetingStartTime;
    public String meetingEndTime;
    public String meetingDescription;

    public void setMeetingTitle(String meetingTitle){
        this.meetingTitle = meetingTitle;
    }

    public void setMeetingDate(String meetingDate){
        this.meetingDate = meetingDate;
    }

    public void setMeetingStartTime(String meetingStartTime){
        this.meetingStartTime = meetingStartTime;
    }

    public void setMeetingEndTime(String meetingEndTime){
        this.meetingEndTime = meetingEndTime;
    }

    public void setMeetingDescription(String meetingDescription){
        this.meetingDescription = meetingDescription;
    }
}

class DepartmentMeetingScheduler{

    public ArrayList<Meeting> meetingList = new ArrayList<>();
    public void scheduleMeeting(Meeting newMeeting){
        if(meetingList.isEmpty()){
            meetingList.add(newMeeting);
            System.out.println("\nScheduled successfully");
            return;
        }else{
            for (int i=0; i<meetingList.size(); i++){
                if(newMeeting.meetingDate.equals(meetingList.get(i).meetingDate)){
                    String[] startTimeArr1 = newMeeting.meetingStartTime.split(":");
                    String[] endTimeArr1 = newMeeting.meetingEndTime.split(":");

                    String[] startTimeArr2 = meetingList.get(i).meetingStartTime.split(":");
                    String[] endTimeArr2 = meetingList.get(i).meetingEndTime.split(":");

                    int t1 = Integer.parseInt(startTimeArr1[0])*60 + Integer.parseInt(startTimeArr1[1]);
                    int t2 = Integer.parseInt(endTimeArr1[0])*60 + Integer.parseInt(endTimeArr1[1]);

                    int t3 = Integer.parseInt(startTimeArr2[0])*60 + Integer.parseInt(startTimeArr2[1]);
                    int t4 = Integer.parseInt(endTimeArr2[0])*60 + Integer.parseInt(endTimeArr2[1]);

                    if(t1<=t4 && t1>=t3 || t2<=t4 && t2>=t3){
                        System.out.println("\nCollision! Already another meeting is scheduled.");
                        return;
                    }
                }
            }
        }
        meetingList.add(newMeeting);
        System.out.println("\nScheduled successfully");
    }

    public void displayMeeting(String date){
        for(int i=0; i<meetingList.size(); i++){
            if (meetingList.get(i).meetingDate.equals(date)){
                System.out.println("On " +
                        meetingList.get(i).meetingDate +
                        ", from " +
                        meetingList.get(i).meetingStartTime +
                        " to " +
                        meetingList.get(i).meetingEndTime +
                        " : " +
                        meetingList.get(i).meetingTitle +
                        " : " +
                        meetingList.get(i).meetingDescription);
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DepartmentMeetingScheduler meetingList = new DepartmentMeetingScheduler();
        while(true){
            System.out.println("\n1. Schedule Meeting");
            System.out.println("2. List Meetings");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            if(choice==1){
                Meeting newMeeting = new Meeting();

                //Taking Input
                System.out.print("\nTitle - ");
                newMeeting.setMeetingTitle(input.nextLine());
                System.out.print("Date - ");
                newMeeting.setMeetingDate(input.nextLine());
                System.out.print("Start time - ");
                newMeeting.setMeetingStartTime(input.nextLine());
                System.out.print("End time - ");
                newMeeting.setMeetingEndTime(input.nextLine());
                System.out.print("Description - ");
                newMeeting.setMeetingDescription(input.nextLine());

                meetingList.scheduleMeeting(newMeeting);
            }if(choice==2){
                if(meetingList.meetingList.isEmpty()){
                    System.out.println("\nNo meetings scheduled.");
                    System.exit(0);
                }
                for (int i=0; i<meetingList.meetingList.size(); i++){
                    String date = meetingList.meetingList.get(i).meetingDate;
                    meetingList.displayMeeting(date);
                }
                System.exit(0);
            }
        }
    }
}