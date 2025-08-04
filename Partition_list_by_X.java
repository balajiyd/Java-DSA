public void partitionList(int x){
        
        if(head == null){return;}
        
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        
        Node current = head;
        
        while(current != null){
            if(current.value < x){
                prev1.next = current;
                prev1 = current;
            }
            else{
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        
        head = dummy1.next;

 }
