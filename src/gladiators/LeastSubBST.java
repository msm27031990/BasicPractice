package gladiators;

import java.util.ArrayList;
import java.util.List;

public class LeastSubBST {

	static List<Integer> sums = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Node root = new Node(5, 
							new Node(2, 
									new Node(10, 
											null, 
											null), 
									new Node(1, 
											new Node(12, 
													null, 
													null), 
											new Node(1,
													null,
													null))), 
							new Node(7, 
									null, 
									null));
		search(root, 0);
		System.out.println("Sums");
		int least = -1;
		for(int iter : sums) {
			if(least == -1 || least > iter) {
				least = iter;
			}
			System.out.println(iter);
		}
		System.out.println("Least Sum " + least);

	}
	
	public static void search(Node node, int sum) {
		if(node.left != null && node.right != null) {
			search(node.left, node.value + sum);
			search(node.right, node.value + sum);
		}else {
			sums.add(sum + node.value);
		}
	}
}

class Node{
	public int value;
	public Node left;
	public Node right;
	
	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
