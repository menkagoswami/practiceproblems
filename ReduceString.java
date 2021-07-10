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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReduceString {

	public static String reduceString(String str) {

		Map<Character, Integer> map = new HashMap<>();
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, ++val);
			} else {
				map.put(ch, 1);
			}
			i++;
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : set) {
			sb.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(sb.toString());
		if (sb.length() > str.length())
			return str;
		return sb.toString();
	}

	public static void main(String[] args) {
		String val = ReduceString.reduceString("AAACFDFaaacdfert");

		// System.out.println(val);
	}

}
