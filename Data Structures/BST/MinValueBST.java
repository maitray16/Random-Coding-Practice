class Node{
	int data;
	Node left, right;

	Node(int d)
	{
		data = d;
		left = right = null;
	}
}
class MinValueBST
{
	static Node head;
	public static Node insert(Node node, int data)
	{
		if(node == null)
		{
			return (new Node(data));
		}
		else
		{
			if(data <= node.data)
			{
				node.left = insert(node.left, data);
			}
			else
			{
				node.right = insert(node.right, data);
			}
		}

		return node;

	}

	public static int minvalue(Node node)
	{
		Node current = node;
		while(current.left != null){
			current = current.left;
		}

		return (current.data);
	}

	public static void main(String[] args) {
		MinValueBST tree = new MinValueBST();
		Node root = null;
		root = tree.insert(root, 4);
		tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);
        System.out.println("The minimum value of BST is " + tree.minvalue(root));

	}
}