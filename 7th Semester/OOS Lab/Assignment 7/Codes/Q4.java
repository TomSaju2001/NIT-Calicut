import java.util.*;

interface SortVotes{
    void ascendDisplay();
    void descendDisplay();
}

class ElectionPost implements  SortVotes{
    String nameOfThePost;
    ArrayList<String> listOfCandidates = new ArrayList<>();
    ArrayList<String> votesEntered = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();

    public void display(){
        System.out.println(nameOfThePost);
        Collections.sort(listOfCandidates);
        for (String listOfCandidate : listOfCandidates) {
            System.out.println(listOfCandidate);
        }
    }

    public void addNameOfThePost(String nameOfThePost){
        this.nameOfThePost=nameOfThePost;
    }

    public void addCandidates(String candidateName){
        listOfCandidates.add(candidateName);
    }

    public void addVotes(String name){
        votesEntered.add(name);
        if(map.containsKey(name)){
            map.put(name,map.get(name)+1);
        }else{
            map.put(name,1);
        }
    }

    @Override
    public void ascendDisplay(){
        List<Map.Entry<String, Integer> > list =new LinkedList<Map.Entry<String, Integer> >(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2){
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for (Map.Entry<String, Integer> en : temp.entrySet()) {
            System.out.println( en.getKey() +" - " + en.getValue());
        }
    }

    @Override
    public void descendDisplay(){
        List<Map.Entry<String, Integer> > list =new LinkedList<Map.Entry<String, Integer> >(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for (Map.Entry<String, Integer> en : temp.entrySet()) {
            System.out.println( en.getKey() +" - " + en.getValue());
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameOfThePost = input.nextLine().trim();
        ElectionPost electionPost = new ElectionPost();
        electionPost.addNameOfThePost(nameOfThePost);
        //Total candidates
        int n = input.nextInt();
        input.nextLine();

        //Taking names of n candidates
        for (int i=0; i<n; i++){
            String candidate = input.nextLine().trim();
            electionPost.addCandidates(candidate);
        }

        //Total number of numbers
        int m = input.nextInt();
        input.nextLine();
        for(int i=0; i<m; i++){
            String str = input.nextLine().trim();
            electionPost.addVotes(str);
        }
        electionPost.display();
        electionPost.ascendDisplay();
        electionPost.descendDisplay();
        input.close();
    }
}


/*
Sample Input:
General Secretary
3
SALEENA JOSEPH
MANU J
ASHISH TOBY
14
SALEENA JOSEPH
SALEENA JOSEPH
MANU J
MANU J
SALEENA JOSEPH
SALEENA JOSEPH
SALEENA JOSEPH
ASHISH TOBY
ASHISH TOBY
ASHISH TOBY
SALEENA JOSEPH
SALEENA JOSEPH
SALEENA JOSEPH
SALEENA JOSEPH

Sample Output:
General Secretary
SALEENA JOSEPH
MANU J
ASHISH TOBY
MANU J - 2
ASHISH TOBY - 3
SALEENA JOSEPH - 9
SALEENA JOSEPH - 9
ASHISH TOBY - 3
MANU J - 2
*/