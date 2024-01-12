package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	//매소드 gs
		
	//메소드 일반
		
		public void add(Circle c) {
			//현재배열개수+1 배열을 새로 만든다.
			//이전배열의 값을 새배열에 옮긴다.
			//마지막방에 새주소를 추가한다.
			
			//배열새로 만들고 이전거 복사하고 받은거 추가하고 etc 
			cArray[crtPos] = c;
			// crtPos = crtPos + 1;
			crtPos +=1;
			
		}

		public int size() {
			
			return crtPos;
		}
		public Circle get(int index) {
			
			return cArray[index];// index방 안에 있는 Point주소
			
		}
		
		

	

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}

}
