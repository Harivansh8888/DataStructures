import java.util.*;
class Queue
{
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	Queue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Underflow !");
			System.exit(1);
		}
		
		else
		{
			System.out.println("Removing "+ arr[front]);
			front = (front + 1) % capacity;
			count--;
		}
	}
	
	public void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("Overflow !");
			System.exit(1);
		}
		
		else
		{
			System.out.println("Removing "+ arr[front]);
			rear = (rear + 1) % capacity;
			arr[rear] = item;
			count++;
		}
	}
	
