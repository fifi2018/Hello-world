import java.util.Scanner;

public class Testing {

	public static void main(String[] args)
	{
		int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
		// columns
		for (int i = 0; i < twoDArray.length; i++) {
		// rows
		for (int j = 0; j < twoDArray[i].length; j++) {
		System.out.print(twoDArray[i][j]);
		}
		// after each row, print a new line
		System.out.println();

	}

}}