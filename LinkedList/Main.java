package LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(40);
		list.insert(30);
		list.insert(20);
		list.insert(10);
		
		list.display();
		list.displayReverse();
		
		
		list.insertAtPosition(55, 2);
		list.insertAtPosition(77, 5);
		list.display();
		
		list.delByVal(77);
		list.display();
		
		

	}

}
