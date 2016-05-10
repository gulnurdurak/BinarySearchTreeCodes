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
			  while(number!=0){
			  tree.insert(number);
			  number=s.nextInt();
			  
			  }
			  System.out.println(tree.getCount()+" numbers are added");
			  break;
		  case 2:
			  System.out.print("Enter a number to be seach: ");
			  number=s.nextInt();
			  if(tree.search(number))
				  System.out.println("exist");
			  else
				  System.out.println("not exist");		  
		  break;
		  case 3:
			  System.out.println("Enter a number to be deleted: ");
			  number=s.nextInt();
			  tree.delete(number);
			  System.out.println(number+" is deleted");
			  break;
		  case 4:
			  System.out.print("Ordered list: ");
			  tree.inorder();
			  break;
		  case 5:
			//  tree.breadthFirstTravelsal();
			  break;
		  case 6:
			  System.out.print("# of nodes:"+tree.getCount());
			  
			  break;
		  case 7:
			  System.out.println("Height: "+tree.getHeight());
			  break;
		  case 8:
			  System.out.println("# of leaf nodes: "+tree.getNumberofLeaves());
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


