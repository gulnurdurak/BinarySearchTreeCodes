import java.util.Scanner;


public class TestBST {
  public static void main(String[] args) {
	  BST tree = new BST();
	  int option=0;
	  int number;
	  Scanner s=new Scanner(System.in);
	  do{
		  System.out.print("\n\nMenu:\n1. Insert Number\n2. Search a number\n3. Delete a number\n4. Display tree as an ordered list" +
		  		"\n5. Display Tree (breadthFirstTravelsal)\n6. Display count of nodes\n7. Display height of tree\n8. Display count of leaf nodes\n"+
				  "9. Exit");
		  System.out.print("\n\nOption>> ");
		  option=s.nextInt();
		  switch(option){
		  case 1:
			  
			  System.out.println("Enter numbers (0 is exit) >> ");
			  number=s.nextInt();
			  int counter = 0;
			  while(number!=0){
			  tree.insert(number);
			  counter ++;
			  number=s.nextInt();
			  
			  }
			  System.out.print(counter);
			  if (counter>1)
				  System.out.println(" numbers are added");
			  else
				  System.out.println(" number is added.");
			  break;
		  case 2:
			  System.out.print("Enter a number to be search: ");
			  number=s.nextInt();
			  if(tree.search(number))
				  System.out.println("Exist.");
			  else
				  System.out.println("Not exist.");		  
		  break;
		  case 3:
			  System.out.println("Enter a number to be deleted: ");
			  number=s.nextInt();
			  if (tree.isEmpty())
				  System.out.println("Tree is empty.");
			  else
			  {
				  tree.delete(number);
				  System.out.println(number+" is deleted.");
			  }
			  break;
		  case 4:
			  System.out.print("Ordered list: ");
			  tree.inorder();
			  break;
		  case 5:
			  if (tree.isEmpty())
				  System.out.println("Tree is empty.");
			  else
			  {
				  tree.breadthFirstTravelsal(tree.getRoot());
				  tree.levelByLevel(tree.getRoot());
			  }
			  break;
		  case 6:
			  System.out.print("# of nodes:"+tree.getCount());
			  break;
		  case 7:
			  System.out.println("Height: "+tree.getHeight(tree.getRoot()));
			  break;
		  case 8:
			  System.out.println("# of leaf nodes: "+tree.getNumberofLeaves(tree.getRoot()));
			  break;
		  case 9:
			  System.out.println("Goodbye my lover :-*");
			  break;
			  default:
				  System.out.println("Try again!!!");
		  }
	  }while(option!=9);
  }
	  
	  
  }


