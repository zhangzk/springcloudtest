/**
 * 
 */
package com.example.zhangzk.weiqi;

import java.util.List;

import org.springframework.util.CollectionUtils;

/**
 * 
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] iArr = new int[][] { 
			{0,0,0,0,0,0},
			{1,0,0,0,0,0},
			{-1,0,0,0,0,0},
			{-1,1,0,0,0,0},
			{1,0,0,0,0,0},
			{0,0,0,0,0,0},
			};
			
			int x=2;
			int y=1;
			
			
			getNext(iArr,x,y);
	}
	
	static int[][] getNext(int[][] iArr,int pRow,int pCol){ 

		
		if( iArr == null || iArr.length != iArr[0].length) {
			throw new RuntimeException("输入数组不是N*N");
		}
		
		if( pRow >= iArr.length || pCol>= iArr.length) {
			throw new RuntimeException("pRow或者pCol必须小于N");
		}
		
		
		iArr[pRow][pCol]=1;
		
		for( int row=0;row<iArr.length;row++) {
			for( int col=0;col<iArr.length;col++) {
				if( iArr[row][col] !=0) {
					QI qi = getQi(row,col);
					List<Point> selfPointList = qi.getSelfPointSet();
					if( CollectionUtils.isEmpty(selfPointList)) {
						//无相邻的同色节点
						
						if( qi.getQiCount()>0) {
							//活跃，标识后则结束
						}else {
							//需要提取，标识后则结束
						}
					}else {
						//有相邻的同色节点
						
						
					}
					
				}
			
			}
			
		}
		
		
		int[][] result = null;
		return result;
		
	}
	
	static QI getQi(int pRow,int pCol) {
		QI qi = new QI();
		
		return qi;
		
	}
	
	static class QI {
		int qiCount;
		List<Point> selfPointSet;
		
		public QI() {
			
		}
		
		public int getQiCount() {
			return qiCount;
		}
		public void setQiCount(int qiCount) {
			this.qiCount = qiCount;
		}
		public List<Point> getSelfPointSet() {
			return selfPointSet;
		}
		public void setSelfPointSet(List<Point> selfPointSet) {
			this.selfPointSet = selfPointSet;
		}
		
	}
	
	static class Point{
		int pRow;
		int pCol;
	}
}
