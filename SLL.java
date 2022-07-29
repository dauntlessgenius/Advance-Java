import java.util.StringJoiner;

public class SLL<E> {

	//instance variables
	private Node<E> head;
	
	private int numberOfNodes;
	
	//constructors
	public SLL() {
		head = null;
		numberOfNodes = 0;
	}
	
	public SLL(Node<E> initNode) {
		//assumptions is the initNode has data in it, 
		//and its next reference points to null
		head = initNode;
		numberOfNodes++;
	}
	
	//methods
	public void add(Node<E> newNode) {
		
		//inserts a new node to the left of the SLL
		newNode.setNext(head);
		head = newNode;
		newNode = null;
		numberOfNodes++;
		
		//in case we're adding a node to an empty list
		
	}
	
	
	
	public void removeFromLeft() {
		
	 if(head.getNext() == null) {
			//case 1: only one node
			head = null;
			
			numberOfNodes = 0;
		}else {
			//case 2: there are many nodes...
			head = head.getNext(); //move the head to the right
			numberOfNodes--;
		}
		
		
	}
	
	
	public int getSize() {
		return numberOfNodes;
	}
	public void delete() {
		head = null;
		
		numberOfNodes = 0;
	}
	
	
	public Node<E> search(E target){
		Node<E> location = head;
		
		while(location != null) {
			if(location.getData().equals(target)) {
				return location;
			}
			location = location.getNext();
		}
		return null;
	}
	
	public String toString() {
		
		StringJoiner sj1 = new StringJoiner("->");
		sj1.add(numberOfNodes + ":");
		
		Node<E> current = head;
		
		while(current != null) {
			sj1.add(current.toString());
			current = current.getNext();//point to the next object
		}
		
		
		return sj1.toString();
		
	}
	
	public String printHead() {
		return head.toString();
	}
}
