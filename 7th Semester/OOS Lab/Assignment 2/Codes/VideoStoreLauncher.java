import java.io.*;
import java.util.ArrayList;

public class VideoStoreLauncher {
    public static class Video {
        public static int RETURNED = 0;
        public static int RENTED = 1;

        String title;
        int status;

        public Video(String title){
            this.title = title;
            status = Video.RETURNED;
        }

        public int getVideoStatus() {
            return status;
        }

        public void rent() {
            status = Video.RENTED;
        }

        public void returnVideo() {
            status = Video.RETURNED;
        }
    }

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Video> videos = new ArrayList<>();

        do {
            System.out.println("Choice:");
            int option = Integer.parseInt(br.readLine());

            if(option == 1){
                System.out.println("N: ");
                int n = Integer.parseInt(br.readLine());
                System.out.println("Title: ");
                for(int i=0;i<n;i++){
                    String title = br.readLine();
                    Video video = new Video(title);
                    videos.add(video);
                }
            }else if(option == 2){
                System.out.println("Title:");
                String title = br.readLine();
                boolean flag = true;
                for(Video video: videos){
                    if(video.title.compareTo(title) == 0){
                        if(video.status == Video.RETURNED) {
                            flag = false;
                            System.out.println("Available");
                            break;
                        }
                    }
                }
                if(flag){
                    System.out.println("Not Available");
                }
            }else if(option == 3){
                // Rent
                System.out.println("Title:");
                String title = br.readLine();
                boolean available = false;

                int curVideoIndex = -1;
                int i = 0;

                for(Video video: videos){
                    if(video.title.compareTo(title) == 0){
                        if(video.getVideoStatus() == Video.RETURNED) {
                            available = true;
                            curVideoIndex = i;
                        }
                        break;
                    }
                    i++;
                }

                if(!available){
                    System.out.println("Not Available");
                }

                videos.get(curVideoIndex).rent();
                
            }else if(option ==4){
                // Return

                String title = br.readLine();

                int curVideoIndex = -1;
                int i = 0;

                for(Video video: videos){
                    if(video.title.compareTo(title) == 0){
                        curVideoIndex = i;
                        break;
                    }
                    i++;
                }

                videos.get(curVideoIndex).returnVideo();

            }else if(option == 5){
                // List Inventory

                String result = "";
                
                for(Video video: videos){
                    if(video.getVideoStatus() == Video.RETURNED) {
                        result+=("\""+video.title+"\""+", ");
                    }
                }

                System.out.println(result.substring(0, result.length() - 2));
            }else if(option == 6){
                break;
            }
        }while(true);
    }
}