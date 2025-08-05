public void reverseBetween(int x,int y){
        if(head == null){return;}
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        for(int i=0;i<x;i++){
            prev = prev.next;
        }
        Node current = prev.next;
        
        for(int i=0; i<y-x;i++){
            Node toMove = current.next;
            current.next = toMove.next;
            toMove.next = prev.next;
            prev.next = toMove;
        }
        head = dummy.next;
     }
