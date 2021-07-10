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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {

	public static void setZero(int[][] arr, int rows, int columns, List<Integer> list) {
		for (int i = 0; i <= list.size() - 2; i = i + 2) {
			int row = list.get(i);
			int col = list.get(i + 1);

			for (int k = 0; k < columns; k++) {
				arr[row][k] = 0;
			}

			for (int m = 0; m < rows; m++) {
				arr[m][col] = 0;

			}
		}
		System.out.println("Resultant Matrix with zero elements as required is --");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, columns;
		System.out.println("Enter number of rows");
		rows = sc.nextInt();
		System.out.println("Enter number of columns");
		columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 0) {
					list.add(i);
					list.add(j);
				}
			}

		}
		System.out.println("Original Matrix-->");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		Matrix.setZero(arr, rows, columns, list);
		sc.close();

	}

}