public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        while(prev.next != null && prev.next.next != null){
            Node first = prev.next;
            Node second = first.next;
            
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            prev = first;
        
    
}
head = dummy.next;
}
