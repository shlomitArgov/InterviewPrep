/**
 * 
 */
package com.prep;

import java.util.ArrayList;

/**
 * @author Shlomit
 * 
 */
public class BinarySearchTree {

	private TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	public BinarySearchTree(TreeNode node) {
		this.root = new TreeNode(node);
	}

	public TreeNode getRoot() {
		return this.root;
	}

	public void insert(Integer newData) {
		TreeNode currRoot = this.root;
		TreeNode newNode = new TreeNode(newData, null, null);
		TreeNode childNode;
		int diff;

		if (this.root == null) {
			this.root = newNode;
			return;
		}

		while (currRoot != null) {
			diff = currRoot.getData().compareTo(newData);

			if (diff > 0) {
				childNode = currRoot.getLeft();
				if (childNode == null) {
					currRoot.setLeft(newNode);
					return;
				}
			} else if (diff < 0) {
				childNode = currRoot.getRight();
				if (childNode == null) {
					currRoot.setRight(newNode);
					return;
				}
			} else { // diff == 0
				// node already exists - nothing to do
				return;
			}
			currRoot = childNode;
		}
	}

	public TreeNode search(Integer searchData) {
		return searchHelper(this.root, searchData);
	}

	private TreeNode searchHelper(TreeNode root, Integer searchData) {
		TreeNode currNode = root;
		int diff;

		if (currNode == null) {
			return null;
		} else {

			diff = currNode.getData().compareTo(searchData);

			if (diff == 0) {
				return currNode;
			} else if (diff > 0) {
				return searchHelper(root.getLeft(), searchData);
			} else {
				return searchHelper(root.getRight(), searchData);
			}
		}
	}

	public TreeNode breadthFirstSearch(Integer searchValue) {
		//TODO: add test for BFS
		TreeNode currNode;
		ArrayList<TreeNode> nodesToCheckList = new ArrayList<TreeNode>();
		if(this.root == null){
			return null;
		}
		nodesToCheckList.add(this.root);
		while (nodesToCheckList.size() > 0) {
			currNode = nodesToCheckList.remove(0);
			if (currNode.getData().compareTo(searchValue) == 0) {
				return currNode;
			}
			if(currNode.getLeft() != null){
				nodesToCheckList.add(currNode.getLeft());	
			}
			if(currNode.getRight() != null){
				nodesToCheckList.add(currNode.getRight());	
			}
		}
		return null;
	}

	public TreeNode depthFirstSearch(Integer searchValue) {
		//TODO: add test for DFS
		ArrayList<TreeNode> nodesToCheckList = new ArrayList<TreeNode>();
		if (this.root == null){
			return null;
		}
		TreeNode currNode = null;
		nodesToCheckList.add(this.root);

		while (nodesToCheckList.size() > 0) {
			if (currNode == null) {
				currNode = nodesToCheckList.get(0);
			}
			if (currNode.getData().compareTo(searchValue) == 0) {
				return currNode;
			}
			if (currNode.getRight() != null) {
				nodesToCheckList.add(0, currNode.getRight());
			}
			currNode = currNode.getLeft();
		}
		return null;
	}

	public String printInOrder(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		printInOrderHelper(root, sb);
		return sb.toString();
	}

	private void printInOrderHelper(TreeNode root, StringBuilder sb) {
		if (root == null) {
			return;
		}
		printInOrderHelper(root.getLeft(), sb);
		sb.append(root.getData().toString() + ' ');
		printInOrderHelper(root.getRight(), sb);
	}

	public TreeNode remove(TreeNode node) {
		// TODO: Implement remove
		return null;
	}
}
