import java.util.*;

public class PostorderGT{
		
	class Node{

		int val;
		List<Node> _children;

		public Node(){}
		public Node(int x){ this.val = x;}
	}
	
	public List<Integer> preorder(Node root){

		List<Integer> res = new ArrayList<>();

		helper(root, res);
		return res;
	}

	public void helper(Node root, List<Integer> res){

		if(root == null){
			return;
		}

		for(int i = 0;i < root.children.size();i++){
			helper(root.children.get(i), res);
		}

		res.add(root.val);
	}

}