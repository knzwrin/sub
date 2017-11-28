package com.internousdev.sub.action;

import java.util.Arrays;

/*import org.apache.commons.lang3.ArrayUtils;*/

public class StringSample {

	public static void main(String[] args) {
		String str = "東京都足立区";

		if(str.contains("都")||str.contains("道")||str.contains("府")||str.contains("県")){
			if(str.contains("市")||str.contains("区")||str.contains("町")||str.contains("村")){
				
			}
		}
//
//		String serachConfs = "AAA,BBB,CCC,DDD";
//
//		String[] conf = serachConfs.split(",");
//
//		System.out.println(Arrays.toString(conf));
//
//		String[] targets ={"aaa", "bbb", "CcC", "DDD"};
//
//		for(int index = 0; targets.length>index; index++) {
//
//		if(ArrayUtils.indexOf(conf[index],targets)){
//
//		System.out.println("含む");
//
//		} else {
//
//		System.out.println("含まない");
//		}

//		配列の要素同士の比較
		int[] test1 = {3,5,8};
		int[] test2 = {3,5,8};
		int[] test3 = {3,5,9};
		System.out.println("test1,test2の比較：" + Arrays.equals(test1,test2));
		System.out.println("test1,test3の比較：" + Arrays.equals(test1,test3));
		}

}

