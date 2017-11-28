package com.internousdev.sub.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSample {

	public static void main(String[] args) {
//		String str = "東京都足立区";
//
//		if(str.contains("都")||str.contains("道")||str.contains("府")||str.contains("県")){
//			if(str.contains("市")||str.contains("区")||str.contains("町")||str.contains("村")){
//				System.out.println("ok");
//			}
//		}
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
//		int[] test1 = {3,5,8};
//		int[] test2 = {3,5,8};
//		int[] test3 = {3,5,9};
//		System.out.println("test1,test2の比較：" + Arrays.equals(test1,test2));
//		System.out.println("test1,test3の比較：" + Arrays.equals(test1,test3));

//		住所、メールアドレスに使う
//		文字列を受け取って、その文字列が指定した文字列を含んでいるか確認する
//		String str2 = "";
//		String [] targetA = {"都","道","府","県"};
//		String [] targetB = {"市","区","町","村"};
//		int count = 0;
//		for (int i=0; i < targetA.length; i++){
//			if(str2.contains(targetA[i])){
//				count++;
//			}
//
//		}
//		for (int j=0; j < targetB.length; j++){
//			if(str2.contains(targetB[j])){
//				count++;
//			}
//		}
//
//		確認項目の内容が同じ場合
//		for (int i=0; i < targetA.length; i++){
//			if(str2.contains(targetA[i])){
//			count++;
//			}
//			if(str2.contains(targetB[j])){
//			count++;
//			}
//		}
//			if(errorcount < 2){
//				return error;
//			}
//		}


//		郵便番号判定に使う
		String postalcode = "120-0015";
		String regex = "^\\d{3}-\\d{4}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(postalcode);
		System.out.println(m.find());
//		http://java-reference.com/java_string_regex.htmlを確認
//		郵便番号にマッチ
//		半角数値3桁、半角ハイフン、半角数値4桁
//		String regex1 = "\\d";
//		String regex2 = "[-]";
//		Pattern p1 = Pattern.compile(regex1);
//		Matcher m1 = p1.matcher(str3);
//		Pattern p2 = Pattern.compile(regex2);
//		Matcher m2 = p2.matcher(str3);
//		System.out.println(m1.find());
//		System.out.println(m2.find());

	}
}


