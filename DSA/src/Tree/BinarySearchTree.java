package Tree;


class Node<T>{
	public T data;
	Node<T> left;
	Node<T> right;
	
	Node(){};
	
	Node(T data){
		this.data=data;
	}
}

class BST<T>{
	public Node<T> root;
	BST(T n){
		root=new Node<T>(n);
	}
	
	public <T extends Comparable<T>> void insertNode(Node<T> ptr, T val) {
		
		if(ptr==null)
			return;
		
		if(val.compareTo(ptr.data)>=0) {
			if(ptr.right==null) {
				ptr.right=new Node<T>(val);
				System.out.println("Node inserted");
			}
			else {
				this.insertNode(ptr.right, val);
			}
		}
		else {
			if(ptr.left==null) {
				ptr.left=new Node<T>(val);
				System.out.println("Node inserted");
			}
			else {
				this.insertNode(ptr.left, val);
			}
		}
		
	}
	
	//inorder Traversal
	public void inorderTraversal(Node<T> root) {
		
		if(root==null) return;
		
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	}
	
	//preorder Traversal
	public void preorderTraversal(Node<T> root) {
		
		if(root==null) return;
		
		System.out.print(root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	//postorder Traversal
		public void postorderTraversal(Node<T> root) {
			
			if(root==null) return;
			
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+" ");
		}
		
		
	//count nodes
		
	public int countNodes(Node<T> root,int cnt) {
		
		if(root==null) {
			return 0;
		}
		
		if(root.left == null && root.right==null) {
			return 1;
		}		
		
		cnt = countNodes(root.left,cnt)+countNodes(root.right,cnt)+1;
		
		return cnt;
		
	}
	
	
	//count the no of leaves
	public int countLeafNodes(Node<T> root,int cnt[]) {
		
		if(root==null) return 0;
		
		if(root.left==null && root.right==null) {
			cnt[0]=cnt[0]+1;
			return 0;
		}
		
		countLeafNodes(root.left,cnt);
		countLeafNodes(root.right,cnt);
		return cnt[0];
	}
	
	//Find height 
	
	public int findHeight(Node<T> root,int h) {
		
		if(root==null) return 0;
		
		if(root.left==null && root.right==null) return 1;
		
		h=Math.max(findHeight(root.left,h),findHeight(root.right,h))+1;
		
		return h;
	}
	
	public <T extends Comparable<T>> void removeNode(Node<T> ptr,T val) {
			
	}
	
}

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<Integer> b = new BST<Integer>(20);
		Node<Integer> root = b.root;
		
		b.insertNode(root,21);
		b.insertNode(root,19);
		b.insertNode(root,34);
		b.insertNode(root,30);
		b.insertNode(root,15);
		b.insertNode(root,10);
		b.insertNode(root,17);
		b.insertNode(root,11);
		
		b.inorderTraversal(root);
		System.out.println();
		b.preorderTraversal(root);
		System.out.println();
		b.postorderTraversal(root);
		System.out.println();
		
		System.out.println("Total No of Nodes: "+b.countNodes(root, 0));
		
		int cnt[]= {0};
		System.out.println("Total No of Leaf Nodes: "+b.countLeafNodes(root, cnt));
		System.out.println("Height of The BST: "+(b.findHeight(root, 0)-1));
		
	}

}
