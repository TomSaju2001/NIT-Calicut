import java.util.*;

class Item{
    int id=0;
    String name="";
    double unitPrice=0.00;
    int quantity=0;

    public void setDetails(int id, String name, double unitPrice){
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
    }

    public int getId(){
        return this.id;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void showDetails(){
        System.out.println(this.id +
                ", " + this.name +
                ", " + this.unitPrice +
                ", " + this.quantity);
    }

}

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;

        HashMap<Integer, Item> items = new HashMap<>();
        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list: ");

        while (true){
            string = input.nextLine();
            //Remove leading and trailing spaces
            string=string.trim();
            if(string.equalsIgnoreCase("OKAY")){
                break;
            }else{
                String[] stringArr = string.split(" ");
                //System.out.println(Arrays.toString(stringArr));
                Item newItem = new Item();
                newItem.setDetails(Integer.parseInt(stringArr[0]), stringArr[1], Integer.parseInt(stringArr[2]));
                items.put(newItem.getId(), newItem);
            }
        }

        while (true){
            System.out.println("\n1. Add Invoice");
            System.out.println("2. Exit");
            System.out.println("Choice:");
            int choice = input.nextInt();
            if (choice==1){
                System.out.println("Add Invoice Item (Y/N)");
                input.nextLine();
                String str = input.nextLine().trim();

                if(str.equalsIgnoreCase("Y")){
                    System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                    double total = 0.00;
                    ArrayList<Item> list = new ArrayList<>();
                    while (true){
                        str = input.nextLine();
                        if(str.equalsIgnoreCase("OKAY")){
                            break;
                        }else{
                            String[] strArr = str.split(" ");
                            if(items.containsKey(Integer.parseInt(strArr[0]))){
                                list.add(items.get(Integer.parseInt(strArr[0])));
                                items.get(Integer.parseInt(strArr[0])).setQuantity(Integer.parseInt(strArr[1]));
                                total += items.get(Integer.parseInt(strArr[0])).getUnitPrice() * Integer.parseInt(strArr[1]);
                            }
                        }
                    }

                    //Printing Invoice
                    printInvoice(list, total);

                }else{
                    //IF N
                    continue;
                }
            }else{
                break;
            }
        }

        input.close();
    }

    public static void printInvoice(ArrayList<Item> list, double total){
        System.out.println("**** INVOICE *****");
        for(int i=0; i<list.size(); i++){
            list.get(i).showDetails();
        }
        System.out.println("Total: "+ total);
        System.out.println("********");
    }
}
