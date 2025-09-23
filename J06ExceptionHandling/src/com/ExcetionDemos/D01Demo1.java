package com.ExcetionDemos;

public class D01Demo1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int i = 2;
		
		try 
		{
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(ArrayStoreException ex)
		{
			System.err.println(ex);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Finally block executed!!!");
		}
		
		
		System.out.println("Program Ends!!!");
	}

}
