package practice;
/* 
* Copyright (c) 2021, Menka Goswami
* All rights reserved.
* 
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
* * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
* * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
* * Neither the name of the <copyright holder> nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
* 
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

// to find unique characters in a string

public class OneEditAway {
	public static boolean oneEditAway(String first, String second) {

		if (Math.abs(first.length() - second.length()) > 1)
			return false;

		int[] arr = new int[26];

		for (int i = 0; i < first.length(); i++) {
			int index = first.charAt(i) - 'a';
			arr[index] = ++arr[index];
		}
		int count = 0;
		for (int j = 0; j < second.length(); j++) {
			int index = second.charAt(j) - 'a';
			int val = arr[index];
			if (val > 0)
				arr[index] = --val;
		}

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] >= 1) {
				count++;
				if (count > 1)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean val = OneEditAway.oneEditAway("pales", "bakes");
		System.out.println(val);
	}

}
