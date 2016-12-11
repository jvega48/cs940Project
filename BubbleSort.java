
public class BubbleSort {
	
//bubble sort for a array of numbers
	public static void bubbleSort(int[] arrayNum)
	{
		int index;
		int lastPos;
		int temp;
		for(lastPos = arrayNum.length - 1; lastPos>=0;lastPos--)
		{
			for(index = 0; index <= lastPos - 1; index++)
			{
				if(arrayNum[index] > arrayNum[index+ 1])
				{
					temp = arrayNum[index];
					arrayNum[index] = arrayNum[index + 1];
					arrayNum[index + 1] = temp; 
				}
			}
		}
	}
//bubble sort for string or any type of char
	public static void bubbleSort(String[] arrayNum)
	{
		int index;
		int lastPos;
		String temp;
		for(lastPos = arrayNum.length - 1; lastPos>=0;lastPos--)
		{
			for(index = 0; index <= lastPos - 1; index++)
			{
				if(arrayNum[index].compareTo(arrayNum[index+ 1]) > 0)
				{
					temp = arrayNum[index];
					arrayNum[index] = arrayNum[index + 1];
					arrayNum[index + 1] = temp; 
				}
			}
		}
	}
	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTree emptyTree = new BinarySearchTree();
	   String items[] = {"zebra","bat","dog","jacket","yellow","kitten","monkey"};
	   String randomWords[] = {"FOOD","CARDS","POTATOS","ZEBRA","ANTS"};
	   int numbers[] = {21,32,29,00,33,23,99,10,2};
	   System.out.println("Demo One:");
	   System.out.println("An array of string before being sorted: ");
		for(String item : items)
	    {
	    	System.out.println(item + " ");
	    	
	    }
	    bubbleSort(items);
		System.out.println();
	    System.out.println("Sorted order: ");
		for(String item : items)
		{
			System.out.println(item + " ");
			
		}
		System.out.println();
		System.out.println("Demo 2:");
		System.out.println("A item of integers before being sorted: ");
				for(int num : numbers)
			    {
			    	System.out.println(num + " ");
			    	
			    }
			    bubbleSort(numbers);
				System.out.println();
			    System.out.println("Sorted order: ");
				for(int num : numbers)
				{
				System.out.println(num + " ");		
				}
				System.out.println("");
				System.out.println("Demo three: ");
				System.out.println("Sorting a random array of string: ");
				for(String str: randomWords)
				{
					System.out.print(str + " - " );
					//System.out.println();
				}
				System.out.println();
				//sorting method with declared array
				bubbleSort(randomWords);
				System.out.println("The array has been sorted: ");
				for(String str: randomWords)
				{
					System.out.print(str + " - ");
				}
				System.out.println("");
				System.out.println("Demo 4: ");
				System.out.println("The first binary three: ");
				tree.insert(4);
				tree.insert(99);
				tree.insert(54);
				tree.insert(8);
				System.out.println("The tree being sorted in order");
				tree.order();
				System.out.println("The tree being sorted in pre-order");
				tree.preorder();
				System.out.println("The tree being sorted in post-order");
				tree.postorder();
				System.out.println("Is the tree empty: " + tree.isEmpty());
				System.out.println("Finding the max value in the tree: " + tree.maxValue());
				System.out.println("Finding the min value in the tree: " + tree.minValue());
				System.out.println();
				System.out.println("The secind binary tree");
				System.out.println("The tree being sorted in order");
				emptyTree.order();
				System.out.println("The tree being sorted in pre-order");
				emptyTree.preorder();
				System.out.println("The tree being sorted in post-order");
				emptyTree.postorder();
				System.out.println("Is the tree empty: " + emptyTree.isEmpty());
				System.out.println("Finding the max value in the tree: " + emptyTree.maxValue());
				System.out.println("Finding the min value in the tree: " + emptyTree.minValue());
				}

    
}
