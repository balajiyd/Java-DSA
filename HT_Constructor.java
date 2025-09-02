public class HashTable {

	private int size = 7;
	private Node[] dataMap;
	
	public class Node{
	    String key;
	    int value;
	    Node next;
	    Node(String key, int value){
	       this.key = key; 
	       this.value = value;
	    }
	    
	}
	
	public HashTable(){
	    dataMap = new Node[size];
	
	}
	

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for(int i=0;i<dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp != null){
              System.out.println("   {"+temp.key+" = "+temp.value+" }");
              temp = temp.next;
            }
        }
    }

}
/////////////////////////////////////  MAIN CLASS
public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.printTable();
        
        
        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
            4:
            5:
            6:

    	*/
      
    }

}
