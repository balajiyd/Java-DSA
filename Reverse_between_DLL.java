 public void reverseBetween(int startIndex, int endIndex) {
        if(head == null || startIndex == endIndex){return;}
        
        Node d = new Node(0);
        d.next = head;
        Node prev = d;
        
        for(int i=0;i<startIndex;i++){
            prev = prev.next;
        
        }
        
        Node current = prev.next;
        
        for(int i=0; i<endIndex-startIndex;i++){
            Node toMove = current.next;
            current.next = toMove.next;
            if(toMove.next != null){
                toMove.next.prev = current;
            }
            toMove.next = prev.next;
            prev.next.prev =  toMove;
            
            prev.next = toMove;
            toMove.prev = prev;
        }
        head = d.next;
        head.prev = null;
    
  } 
