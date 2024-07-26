package thekataproject.hackerrank;

public class LinkedListGeneric<T> {
	
	private T data;
	private LinkedListGeneric<T> nextNode;
	private LinkedListGeneric<T> head;
	public LinkedListGeneric() {
		data = null;
		nextNode = null;
		this.head = null;
	}
	
	public LinkedListGeneric(T data) {
		this.data = data;
		this.nextNode = null;
	}
	
	
	public boolean insertData(T data) {
		LinkedListGeneric<T> newNode = new LinkedListGeneric<T>(data);
		newNode.nextNode = this.head;
		this.head = newNode;
		return true;
		
	}
	
	public void displayLElements() {
		LinkedListGeneric<T> currNode = head;
		while(currNode != null) {
			System.out.println(currNode.data.toString());
			currNode = currNode.nextNode;
		}
		
	}
	
	public boolean findElement (T data) {
		
		if (head == null) {
			return false;
		}
		LinkedListGeneric<T> currNode = head;
		
		while(currNode != null) {
			if(data.equals(currNode.data)) {
				return true;
			}
			currNode = currNode.nextNode;
		}
		return false;
	}
	
	public void deleteElement(T data) {
		if(head == null) 
			return;

		LinkedListGeneric<T> currNode = head;
		
		//Deleting head
		if (head.data.equals(data)) {
			head = head.nextNode;
			return;
		}
		LinkedListGeneric<T> previousNode = head;
		currNode = head.nextNode;
		
		
		while(currNode != null) {
		
			if(currNode.data.equals(data)) {
				previousNode.nextNode = currNode.nextNode;
			}
			
			previousNode = currNode;
			currNode = currNode.nextNode;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListGeneric<String> list = new LinkedListGeneric<String>();
		list.insertData("Bharathwaj");
		list.insertData("Kanagalingam");
		list.insertData("Vinit");
		list.insertData("Haripriya");
		list.displayLElements();
		System.out.println(list.findElement("Haripriya"));
		System.out.println(list.findElement("Kanagalingam"));
		list.deleteElement("Kanagalingam");
		System.out.println(list.findElement("Kanagalingam"));
		
	}
	

}
