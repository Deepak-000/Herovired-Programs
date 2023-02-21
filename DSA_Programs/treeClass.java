package herovired;
import java.io.*;
class tree{
	 int val;
	 tree left = null;
	 tree right = null ;
	 tree(int val){
		 this.val = val;
	 }
}

public class treeClass {

	public static void main(String[] args) {
		tree root = new tree(10);
		addNode(20,root,'l');
		addNode(30,root,'r');
		preOrder(root);
		System.out.println("\n -------------");
		tree temp = root;
		addNode(40,temp.left,'l');
		addNode(50,temp.left,'r');
		addNode(60,temp.right,'l');
		addNode(70,temp.right,'r');
		temp = root.left;
		addNode(80,temp.left,'l');
		addNode(90,temp.left,'r');
		addNode(100,temp.right,'l');
		addNode(110,temp.right,'r');
		temp = root.right;
		addNode(120,temp.left,'l');
		addNode(130,temp.left,'r');
		addNode(140,temp.right,'l');
		addNode(150,temp.right,'r');
		preOrder(root);
		System.out.println("\n -------------");
		/*String[] arr = {
			"Hello",
			"Hello",
			"Hello123"
		};
		try {

			FileWriter wr = new FileWriter("sample.txt");
			for(String s : arr)
				wr.append(s);
			wr.close();
		}catch(Exception e) {
			
		}*/
		
	}
	public static void preOrder(tree root) {
		if(root == null)
			return;
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void addNode(int v,tree root,char c) {
		if(c == 'l') {
			tree temp = root;
			while(temp.left != null) temp = temp.left;
			temp.left = new tree(v);
		}else {
			tree temp = root;
			while(temp.right != null) temp = temp.right;
			temp.right = new tree(v);
		}
	}
}
/*
 * import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try{
            File myFile = new File("D:\\text.txt");
        }catch(Exception e){
            System.out.println("exception occured");
        }
    }
}
 */
