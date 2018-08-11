/**
 * 
 */
package com.prep;

/**
 * @author Shlomit
 *
 */
public class TreeNode {
	
	private Integer data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(){
		this.data = null;
		this.left = null;
		this.right = null;
	}
	public TreeNode(Integer data, TreeNode left,
			TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(TreeNode node){
		this(node.getData(), node.getLeft(), node.getRight());
	}
	
	public Integer getData(){
		return this.data;
	}
	
	public void setData(Integer data){
		this.data = data;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
}