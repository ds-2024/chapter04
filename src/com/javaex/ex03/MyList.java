package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T>{//object를 옮겨서 자료형을 바꾸는식 
	
	//필드
	
		private T[] oArray;
		private int crtPos;
		
		//생성자
		public MyList() {
			//원래 만들지 않음 편의 상 가정
			oArray = (T[])new Object[3];
			crtPos = 0;
		}
		//메소드 일반
			
		public void add(T o) {
		//현재배열개수+1 배열을 새로 만든다.
		//이전배열의 값을 새배열에 옮긴다.
		//마지막방에 새주소를 추가한다.
						
		//배열새로 만들고 이전거 복사하고 받은거 추가하고 etc 
		oArray[crtPos] = o;
	    // crtPos = crtPos + 1;
		crtPos +=1;
						
		}

		public int size() {
						
		return crtPos;
		}
		
		public T get(int index) {
						
		return oArray[index];// index방 안에 있는 Point주소
						
		
			
		}


}
