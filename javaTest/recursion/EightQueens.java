package javaTest.recursion;

public class EightQueens {
	
	
	public static void main(String[] args) {
		// 定义一个数组,在8×8格的国际象棋上摆放8个皇后
		int queen_max = 8;		
		int queen_count = 0;
		int row = 0;
		int[][] ques = new int[queen_max][queen_max];
		EightQueen eightQueen = new EightQueen();
		eightQueen.beginBoard(row, ques);
       
        
		
	}

}

//问题表述为：在8×8格的国际象棋上摆放8个皇后，使其不能互相攻击，
//即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
//1.int[][] ques = new int[8][8];
//2.queens=1--8  ques[row][col] = queens;
//3.任意两个皇后,不能处于同一行、同一列或同一斜线上
//
class EightQueen {
	
	int queen_max = 8;
	int queen_count = 1;
	//定义横竖斜方向上是否有棋子
	boolean flag = true;
	//检查棋盘上是否棋子
	public int checkBoard(int queen_max, int row, int col, int[][] que) {
		//System.out.println("========checkBoard()========");
		//行方向
		for(int i=0; i<queen_max; i++) {
			if(que[row][i]==1) {
				return 0;
			}
		}
		//列方向
		for(int i=0; i<queen_max; i++) {
			if(que[i][col]==1) {
				return 0;
			}
		}
		//右下方向上==右下斜方向向上
        for (int i = row, j = col; i < queen_max && j < queen_max; i++, j++) {
            if (que[i][j] == 1){
                return 0;
            }
        }
        //右上方向上==右上斜方向向上
        for (int i = row, j = col; i >= 0 && j < queen_max; i--, j++) {
            if (que[i][j] == 1){
                return 0;
            }
        }
        //左上方向上==左上斜方向上
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (que[i][j] == 1){
                return 0;
            }
        }
        //左下方向上==左下斜方向上
        for (int i = row, j = col; i < queen_max && j >= 0; i++, j--) {
            if (que[i][j] == 1){
                return 0;
            }
        }
        
        if (flag) {
            //此点符合要求，可以下
        	que[row][col] = 1;
            //如果已经到最后一行，则打印棋盘
            if (row == queen_max - 1){
                printBoard(queen_max, que);
            }
            //可以放
            return 1;
        }
        return 0;
	}
	
	//打印棋盘
    public void printBoard(int queen_max, int[][] que){
    	System.out.println("========"+ queen_count +"========");
    	for (int i = 0; i < queen_max; i++) {
            for (int j = 0; j < queen_max; j++){
                System.out.print(que[i][j] + " ");
            }
            System.out.println();
        }
       // System.out.println("================");
    }
    //开始走棋
    public void beginBoard(int row, int[][] que){
    	//System.out.println("========beginBoard()========");
        //第0列开始
        for (int col = 0; col < queen_max; col++) {
            //检查位置是否可以放棋子
            if (checkBoard(queen_max, row, col, que) == 1){
                if (row == queen_max - 1){
                	queen_count++;
                }
                //递归，向下一行前进
                if (row < queen_max - 1){
                	beginBoard(++row, que);
                    //回退上一个栈
                    --row;
                }
            }
            //重新赋值为0，进行下一次判断
            que[row][col] = 0;
        }
    }
	
}