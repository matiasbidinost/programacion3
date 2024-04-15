package Tp2;

public class Tree {
	private TreeNode root;

	public Tree() {
		this.root = null;
	}

	public void add(Integer value) {
		if (this.root == null)
			this.root = new TreeNode(value);
		else
			this.add(this.root, value);
	}

	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) {
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(), value);
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) {
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(), value);
			}
		}
	}
	public int getRoot() {
		if(this.root!=null)
			return this.root.getValue();
		else
		return 0;
	}
	public TreeNode getR() {
		return this.root;
	}
	public boolean hasElem2(Integer value) {
		return hasElem2(value,this.root);
	}
	private boolean hasElem2(Integer value, TreeNode n) {
		if( n == null) {
			return false;
		}else if(n.getValue().equals(value)) {
			return true;
		}else if(n.getValue()>value){
			return hasElem2(value, n.getLeft());
		}else {
			return hasElem2(value, n.getRight());
		}
	}	
	          public boolean isEmpty() {
		return this.getR()==null;
	}

}
