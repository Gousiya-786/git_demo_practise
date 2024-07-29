package com.wipro.exception;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileException {
	
	public void readFile(String fileName)throws IOException
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while((line = br.readLine())!= null)
			{
				System.out.println(line);
			}
		}
		finally
		{
			if(br != null)
			{
				br.close();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file name :");
		String  fileName = s.nextLine();
		try
		{
			FileException fe =new FileException();
			fe.readFile(fileName);
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("File not found");
		}
		catch(IOException ie)
		{
			System.out.println("Error i/p or olp");
		}
		
	}

}
