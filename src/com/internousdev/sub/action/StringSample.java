package com.internousdev.sub.action;

import java.util.Arrays;

public class StringSample {

	public static void main(String[] args) {
/*		String str = "";

		if(str.contains("都")){

		}*/
		String serachConfs = "AAA,BBB,CCC,DDD";

		String[] conf = serachConfs.split(",");

		System.out.println(Arrays.toString(conf));

		String[] targets ={"aaa", "bbb", "CcC", "DDD"};

		for(int index = 0; targets.length>index; index++) {

		if(conf[index].contains(targets[index])){

		System.out.println("含む");

		} else {

		System.out.println("含まない");
		}

		}

	}

}
