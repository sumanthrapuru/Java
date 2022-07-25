package dsa.list;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	// this is the head node or root node
	private Node<T> root;
	private int numOfItems;
	
	public Node<T> getMiddleNode() {
		
		Node<T> slow = this.root;
		Node<T> fast = this.root;
		
		// O(N/2) = O(N) linear running time
		while(fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();
		}	
		
		return slow;
	}
	
	@Override
	public void insert(T data) {
		
		if(root==null) {
			// this is the first item in the linked list
			root = new Node<>(data);
		} else {
			// we know that this is not the first item in the linked list
			insertBeginning(data);
		}	
	}

	// we just have to update the references O(1)
	private void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	
	// because we have to start with the root node
	// first we have to find the last node in O(N)
	private void insertEnd(T data, Node<T> node) {
		
		// this is when we keep looking for the last node O(N)
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		} else {
			// we have found the last node
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		
		if(root == null) return;
		
		// we want to remove the first node (root)
		if(root.getData().compareTo(data) == 0) {
			root = root.getNextNode();
		} else {
			remove(data, root, root.getNextNode());
		}
		
	}

	@Override
	public void traverseList() {

		if (this.root == null) {
			return;
		}

		Node<T> node = this.root;

		while (node != null) {
			System.out.print(node + " ");
			node = node.getNextNode();
		}
	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
		
		// we have to find the node we want to remove
		while(actualNode != null) {
			// this is the node we want to remove
			if(actualNode.getData().compareTo(data) == 0) {
				// update the references
				numOfItems--;
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public void traverse() {
		
		if(root==null) return;
		
		Node<T> actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}	
	}

	@Override
	public int size() {
		return numOfItems;
	}

}
