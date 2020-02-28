import java.util.Scanner;

class Stack
{
	int top;
	int maxsize = 10;
	int arr[] = new int[maxsize];
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	
	Stack()
	{
		top = -1;
	}
	
	boolean push(Scanner sc)
	{
		if(top ==maxsize-1)
		{
			System.out.println("Overflow !");
			return false;
		}
		else
		{
			System.out.println("Enter value:");
			int val = sc.nextInt();
			top++;
			arr[top] = val;
			System.out.println("Item Pushed");
			return true;
		}
	}
	
