package model;

import java.util.Arrays;
import java.util.Scanner;

public class Equation {

	private final double EPSILON = 1e-9;
	private int n;
	private final int maxn = 1001;
	private double arr[][];
	private double contains[];
	
	public Equation() {
		arr = new double[maxn][maxn];
		contains = new double[maxn];
		this.n = 0;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double[][] getArr() {
		return arr;
	}

	public void setArr(double[][] arr) {
		this.arr = arr;
	}

	public double[] getContains() {
		return contains;
	}

	public void setContains(double[] contains) {
		this.contains = contains;
	}

	public int getMaxn() {
		return maxn;
	}
	
	public boolean SolveSystem() {
		for(int i = 0; i < n; i++) {
			int max_row = i;
			for (int k = i + 1; k < n; ++k) {
	            if (Math.abs(arr[k][i]) > Math.abs(arr[max_row][i])) {
	                max_row = k;
	            }
	        }
			
			 if (Math.abs(arr[max_row][i]) < EPSILON) {
		            // Ma trận không khả nghịch
		            return false;
			 }
			 //swap(arr[i], arr[max_row]);
			 double[] temp = Arrays.copyOf(arr[i], n + 1); // 
			 System.arraycopy(arr[max_row], 0, arr[i], 0, n + 1); 
			 System.arraycopy(temp, 0, arr[max_row], 0, n + 1); 

	        // Làm cho các phần tử trên cột i, trừ phần tử A[i][i], bằng 0
	        for (int k = 0; k < n; ++k) {
	            if (k != i) {
	                double factor = arr[k][i] / arr[i][i];
	                for (int j = i; j <= n; ++j) {
	                    arr[k][j] -= arr[i][j] * factor;
	                }
	            }
	        }
		}
	  // Tính nghiệm của hệ phương trình
	    for (int i = 0; i < n; ++i) {
	        contains[i] = arr[i][n] / arr[i][i];
	    }
	    return true;
	}
	
}
