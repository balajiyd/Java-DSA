 public void swapPairs(){
        if(head == null){return;}
        
        Node d = new Node(0);
        d.next = head;
        Node prev = d;
        
        while(prev.next != null && prev.next.next != null){
            Node first = prev.next;
            Node second = first.next;
            
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            //Rev bonding
            
            second.prev = prev;
            first.prev = second;
            if(first.next!=null){
                first.next.prev = first;
                }
                
       prev = first;
       
     }
  head = d.next;
        head.prev = null;
    }
}
