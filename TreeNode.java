package Tp2;

public class TreeNode {
	private Integer value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public Integer getValue() {
		return value;
	}

	public boolean hasElem(Integer value) {
		if (this.getValue().equals(value)) {
			return true;
			
		} else {
			
			if (this.getValue() < value) {
				if (this.right != null) {
					return this.right.hasElem(value);
					
				} else {
					return false;
				}
			} else {
				if (this.left != null) {
					return this.left.hasElem(value);
				} else {
					return false;
				}
			}
		}
	}

	public void printInOrder(TreeNode root) {
		if (root == null) {
			return;
		}	
		System.out.print("/");
		System.out.print(root.value + " ");
		printInOrder(root.left);
		System.out.print("/");
		printInOrder(root.right);
		System.out.print("/");
	}
}
