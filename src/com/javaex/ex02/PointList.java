package com.javaex.ex02;

import java.util.Arrays;


public class PointList {

	
	//필드
	
		private Point[] pArray;
		private int crtPos;
		
		//생성자
		public PointList() {
			//원래 3개 만들지 않음. 편의상 가정
			pArray = new Point[3]; //가정
			crtPos = 0;
		}
		
		//메소드gs
		
		//메소드 일반
		
		public void add(Point p) {
			//현재배열개수+1 배열을 새로 만든다.
			//이전배열의 값을 새배열에 옮긴다.
			//마지막방에 새주소를 추가한다.
			
			//배열새로 만들고 이전거 복사하고 받은거 추가하고 etc 
			pArray[crtPos] = p;
			// crtPos = crtPos + 1;
			crtPos +=1;
			
		}

		public int size() {
			
			return crtPos;
		}
		public Point get(int index) {
			
			return pArray[index];// index방 안에 있는 Point주소
			
		}

		@Override
		public String toString() {
			return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
		}
		
		
}
