package com.javaTest.recursion_;

public class MiGong {

	public static void main(String[] args) {
		// 老鼠找路游戏
		//定义一个8行7列的地图 int[][] map = new int[8][7];
		//定义行动标识：0可以走，1障碍物，2可以走，3为可以走，但是没走通
		int[][] map = new int[8][7];
		
		//第一行和最后一行位障碍物
		for(int j=0; j<map[0].length; j++) {//列的长度
			map[0][j] = 1;
			map[7][j] = 1;
		}
		
		//第一列和最后一列位障碍物
		for(int i=1; i<map.length-1; i++) {//行的长度
			map[i][0] = 1;
			map[i][6] = 1;
		}
		
		//第4行的2、3列位障碍物
		for(int i=1; i<3; i++) {//行的长度
			map[3][i] = 1;
			map[3][i] = 1;
			
		}
		//增加第3行的3列位障碍物
		map[2][2] = 1;//测试回退现象

		//打印输出地图
		System.out.println("//打印输出地图----------------");
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] map1 = new int[8][7];
		for(int i=0; i<map1.length; i++) {
			for(int j=0; j<map1[0].length; j++) {
				map1[i][j] = map[i][j];
			}
		}
		
		//开始找路
		Search s = new Search();
		s.findWay(map, 1, 1);
		//打印输出找路后的地图
		System.out.println("//findWay()打印输出找路后的地图----------------");
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
				
		s.findWay1(map1, 1, 1);
		//打印输出找路后的地图
		System.out.println("//findWay1()打印输出找路后的地图----------------");
		for(int i=0; i<map1.length; i++) {
			for(int j=0; j<map1[0].length; j++) {
				System.out.print(map1[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

class Search {
	//1.找到map[6][5]=2,找到了位置
	//2.定义一下找路的策略，上下左右，怎么分步骤找路 //1）下-》右-》上-》左 2）上-》右-》下-》左
	//3.定义行动标识：0可以走，1障碍物，2可以走，3为可以走，但是没走通
	//
	public boolean findWay(int[][] map, int row, int col) {
		if( map[6][5]==2 ){//已经找到了
			return true;
		}else {//没找到，还在找
			if(map[row][col]==0) {//能走，但还没走
				map[row][col]=2;
			
				//找路策略 1）下-》右-》上-》左
				if(findWay(map, row+1, col)) {//下
					return true;
				}else if(findWay(map, row, col+1)){//右
					return true;
				}else if(findWay(map, row-1, col)){//上
					return true;
				}else if(findWay(map, row, col-1)){//左
					return true;
				}else {
					map[row][col]=3;
					return false;
				}
			
			}else {//不能走//map[row][col]= 1,2,3
				return false;
			}
		}
		
	}
	
	public boolean findWay1(int[][] map, int row, int col) {
		if( map[6][5]==2 ){//已经找到了
			return true;
		}else {//没找到，还在找
			if(map[row][col]==0) {//能走，但还没走
				map[row][col]=2;
			
				//找路策略  2）上-》右-》下-》左
				if(findWay1(map, row-1, col)) {//上
					return true;
				}else if(findWay1(map, row, col+1)){//右
					return true;
				}else if(findWay1(map, row+1, col)){//下
					return true;
				}else if(findWay1(map, row, col-1)){//左
					return true;
				}else {
					map[row][col]=3;
					return false;
				}
			
			}else {//不能走//map[row][col]= 1,2,3
				return false;
			}
		}
		
	}
	
}