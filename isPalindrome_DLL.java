	public boolean isPalindrome(){
	    if(length<=1){return true;}
	    
	    Node front = head;
	    Node back = tail;
	    for(int i=0;i<length/2;i++){
	        if(front.value != back.value){
	           return false; 
	        
	    }
	    front = front.next;
	    back = back.prev;
	}
	return true;
  }
}
