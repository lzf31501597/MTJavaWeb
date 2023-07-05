package javaTest.recursion;

public class EightQueens {

	public static void main(String[] args) {
		// 定义一个数组,在8×8格的国际象棋上摆放8个皇后
		int[][] ques = new int[8][8];
		
		Queens q = new Queens();
		
		
	}

}

//问题表述为：在8×8格的国际象棋上摆放8个皇后，使其不能互相攻击，
//即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
//1.int[][] ques = new int[8][8];
//2.queens=1--8  ques[row][col] = queens;
//3.任意两个皇后,不能处于同一行、同一列或同一斜线上
//
class Queens {
	//
	public void move(int[][] que, int row, int col) {
		//
		if( que[row].length != que[row+1].length && que[row][col].length != que[row+1][col].length) {
			System.out.println(a + "->" + c);
		}else {
			//如果有多个盘子，可以看成两个，最下面的和上面的所有盘子（num-1）
			//1.先移上面的左右盘子到b,借助c
			move(num-1, a, c, b);
			//2.把最下面的盘子，移到c
			System.out.println(a + "->" + c);
			//3.再把b的所有盘子，移到c，借助a
			move(num-1, b, a, c);
			
		}
		
	}
	
	
	
}