package practice.pattern;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		//int col = sc.nextInt();
		//hollow_rec(row,col);
		//inverted_rotataed_half_pyramid(row, col);
		//inverted_half_pyramid_with_numbers(row, col);
		//floyd_triangle(row, col);
		//zero_one_triangle(row , col);
		//butterfly(row);
		//solid_rhombus(row);
		//hollow_rhombus(row); 
		diamond(row);
		
	}
	
	public static void hollow_rec(int row, int col) {
		for(int i = 1 ; i<=row ; i++) {
			for( int j=1 ; j <=col; j++) {
				if(i==1 || i==row|| j==1 ||j==col) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

	
	
	public static void inverted_rotataed_half_pyramid(int row, int col) {

		for(int i = 1; i <= row ;i++) {
			for(int j = 1; j<= col ; j++) {
				if(i+j >=5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void inverted_half_pyramid_with_numbers(int row, int col) {
		for(int i = 1 ; i<=row; i++) {
			for(int j = 1 ; j<=col+1-i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void floyd_triangle(int row, int col) {
		int counter =1;
		for(int i = 1 ; i<= row; i++) {
			for(int j= 1 ; j<= i ; j++) {
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}
	}
	
	public static void zero_one_triangle(int row , int col) {
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
	public static void butterfly(int row) {
		//1st half
		for(int i = 1; i<=row; i++) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			for(int k = 1 ; k<=2*(row-i) ; k++) {
				System.out.print(" ");
			}
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd Half
		
		for(int i = row; i>=1; i--) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			for(int k = 1 ; k<=2*(row-i) ; k++) {
				System.out.print(" ");
			}
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void solid_rhombus(int row) {
		for(int i = 1 ; i<=row ; i++) {
			for(int j = row-i ; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=row ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void hollow_rhombus(int row) {
		for(int i = 1 ; i<=row ; i++) {
			for(int j = row-i ; j>=1; j--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=row ; j++) {
				if(i==1 || i==row || j==1 || j==row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void diamond(int row) {
		//1 half
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= row -i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= (2*i-1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd half
		
		for(int i = row; i >= 1 ; i--) {
			for(int j = 1 ; j <= row -i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= (2*i-1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
