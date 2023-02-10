package zoho.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset {
	public static void main(String[] args) {
	int[] nums = {1,2,3};
	System.out.println(subset(nums));
	}
	public static List<List<Integer>> subset(int[] nums) {
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> one =new ArrayList<>();
	res.add(one);
	for(int i=0;i<nums.length;i++)
	{
	int len = res.size();
	for(int j=0;j<len;j++) 
	{
	List<Integer> addit = new ArrayList<>(res.get(j));
	addit.add(nums[i]);
	res.add(addit);
	}
	}
	return res;
	}
	
}	