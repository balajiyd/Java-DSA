public void partitionList(int x) {
        if(head == null){return;}
        
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        
        Node p1 = d1;
        Node p2 = d2;
        
        Node current = head;
        
        while(current != null){
            if(current.value<x){
                p1.next = current;
                current.prev = p1;
                p1 = current;
            }else{
                p2.next = current;
                current.prev = p2;
                p2 = current;
            }
        current = current.next;
    }
    p2.next = null;
    p1.next = d2.next;
    
    head = d1.next;
    
    if(d2.next != null){
        d2.next.prev = p1;
    }
    head = d1.next;
    
    if(head != null){
        head.prev = null;
    }
    
  }
