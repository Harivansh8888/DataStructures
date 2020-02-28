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
		
	boolean pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow !");
			return false;
		}
		else
		{
			top--;
			System.out.println("Item Popped");
			return true;
		}
	}
	void display()
	{
		System.out.println("Printing Stack Elements:");
		for(int i = top;i >= 0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

public class Stack_Operations
{
	public static void main(String args[])
	{
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		System.out.println("Stack Operations using Array");
		System.out.println("------------------------------");
		while (ch !=4)
		{
			System.out.println("Choose one:");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.DISPLAY");
			System.out.println("4.EXIT");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					s.push(sc);
					break;
				}
				case 2:
				{
					s.pop();
					break;
				}
				case 3:
				{
					s.display();
					break;
				}
				case 4:
				{
					System.out.println("Exiting....");
					System.exit(0);
					break;
				}
				default:
				{
					System.out.println("Wrong Choice Entered !");
					break;
				}
			}
		}
	}
}
