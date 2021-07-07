package practice;

import java.util.Arrays;

public class StringBuilderMyVersion {

	private char[] arr;

	public char[] getArr() {
		return arr;
	}

	public void setArr(char[] arr) {
		this.arr = arr;
	}

	public StringBuilderMyVersion() {
		this.arr = new char[] { '\0' };
	}

	public StringBuilderMyVersion(String str) {
		this.arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = str.charAt(i);

	}

	public StringBuilderMyVersion concat(String str) {
		int length;
		char[] temp;
		length = (arr[0] == '\0') ? str.length() : this.arr.length + str.length();
		if (this.arr.length > 0) {
			temp = new char[length];
			for (int i = 0; i < arr.length && arr[0] != '\0'; i++)
				temp[i] = arr[i];
			int len = (arr[0] == '\0') ? arr.length - 1 : arr.length;

			for (int i = len, j = 0; j < str.length(); i++, j++)
				temp[i] = str.charAt(j);

			arr = temp;
		}
		System.out.println(Arrays.toString(arr));
		return this;
	}

	public StringBuilderMyVersion deleteCharAt(int index) {
		char[] temp = new char[this.arr.length - 1];
		for (int i = 0; i < index; i++)
			temp[i] = arr[i];
		for (int i = index + 1, j = index; i < this.arr.length; i++, j++)
			temp[j] = arr[i];
		arr = temp;
		System.out.println(Arrays.toString(arr));
		return this;
	}
	
	public int length() {
		return this.arr.length;
	}
	
	public int indexOf(String str) {
		int strLength = str.length();
		int arrLength = this.arr.length;
		int k =0;
		for(int i =0,j=0; i<arrLength && j<strLength;i++) {
			if(arr[i] == str.charAt(j)) {
				j++;
				k=i;
			}else if(arr[i] != str.charAt(j) && j>0) {
				return -1;
			}
		}
		return k-strLength+1;	
	}

	public static void main(String[] args) {
		// StringBuilderMyVersion test = new StringBuilderMyVersion();
		StringBuilderMyVersion test = new StringBuilderMyVersion("mnop");
		test.concat("abcd");
		test.concat("defg");
		test.deleteCharAt(5);
		System.out.println(test.length());
		System.out.println(test.indexOf("cdfg"));
	}
}
