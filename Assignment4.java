package Assignment4;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.HashMap;

class Assignment4 {

	@org.junit.jupiter.api.Test
	void test() {
		
		assertEquals(firstUniqChar("hhasihdiqwhie"), 2);
		assertEquals(firstUniqChar("adwqeqweagsyue"),1 );
		assertEquals(firstUniqChar(""),-1 );
		assertEquals(firstUniqChar("ssggyy"),-1);
		assertEquals(addDigits(345256),7);
	int[] nums1= {0,0,2,0,3};
	int[] nums2= {2,3,0,0,0};
	moveZeroes(nums1);
		assertArrayEquals(nums1, nums2);
		assertEquals(longestPalindrome("waewqcadbbdacer"),"cadbbdac");
		assertEquals(longestPalindrome("waewqer"),"w");
	int[][]nums3={{1,2,3,4},{4,5,6,7},{7,8,9,10}};
	int[][]nums4={{7,4,1,4},{8,5,2,7},{9,6,3,10}};
	assertArrayEquals(rotate(nums3),nums4);
		
	}
	public int firstUniqChar(String s) {
		if(s==null||s.length()==0)
			return -1;
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			}
			else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))==1)
				return i;
		}
		return -1;
	}
	
	public int addDigits(int n) {
		if(n<10)
			return n;
		String s=String.valueOf(n);
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum=sum+(s.charAt(i)-'0');
		}
		return addDigits(sum);
	}
	public void moveZeroes(int[] nums) {
		if(nums.length<=1)
			return;
		int zero=0;
		int nonzero=0;
		while(nonzero<nums.length) {
			while(zero<nums.length&&nums[zero]!=0) {
				zero++;
			}
			if(zero==nums.length)return;
			nonzero=zero+1;
			while(nonzero<nums.length&&nums[nonzero]==0)
				nonzero++;
			if(nonzero==nums.length)return;
				swap(nums,zero,nonzero);
			
		}
	}
	 public void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	 }
	 public String longestPalindrome(String s) {
		 if(s==null||s.length()==0)
			 return "";

		 boolean[][] istrue=new boolean[s.length()][s.length()];
		 int maxlength=0;
		 int start=0;
		 int end=0;
		 for(int i=0;i<s.length();i++) {
			 for(int j=i;j>=0;j--) {
				 if(s.charAt(i)==s.charAt(j)&&(j+1>=i||istrue[j+1][i-1]==true))
				 { istrue[j][i]=true;
				 if(i-j>maxlength) {
					 maxlength=i-j+1;
					 start=j;
					 end=i;
				 }
				 }
				 
			 }
		 }
		 return s.substring(start, end+1);
			//TODO
	 }
	 public int[][] rotate(int[][] matrix) {
		 for(int i=0;i<matrix.length/2;i++)
		 {
			 for(int j=i;j<matrix.length-i-1;j++) {
				 int a=matrix[i][j];
				 matrix[i][j]=matrix[matrix.length-1-j][i];
				 matrix[matrix.length-1-j][i]=matrix[matrix.length-1-i][matrix.length-1-j];
				 matrix[matrix.length-1-i][matrix.length-1-j]=matrix[j][matrix.length-1-i];
				 matrix[j][matrix.length-1-i]=a;
			 }
			 }
		 return matrix;
		 }
	
	
	
	

}
