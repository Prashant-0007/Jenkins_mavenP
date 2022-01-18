/*
prog1:Write a Program to print series of odd numbers ranging between two numbers entered by user.
Input:
Min of Series:4
Max of series:60
Output:
Series of Odd Numbers Ranging between 4 & 60 is:
5 7 9 ....59


*/

import java.io.*;

class Program1 {

public static void main(String... args) throws IOException {

	int iMinNum,iMaxNum;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter Min of Series:");
	iMinNum = Integer.parseInt(br.readLine());
	System.out.println("Enter Max of Series:");
	iMaxNum = Integer.parseInt(br.readLine()); 

	int i=iMinNum;
	int count=0;

	while(i<=iMaxNum) {

		if(i%2==1) {
			count++;
			if(count==1)
			System.out.printf("Series of Odd Numbers Ranging between %d & %d is:\n",iMinNum,iMaxNum);
			System.out.printf("%d\t",i);
		}

		i++;
	}
	System.out.printf(" \n");
}
}
