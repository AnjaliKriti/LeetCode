package org.example.datastructure.arraystring;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args){
        int[] nums = {1,3,2,3};
        int val = 3;

        System.out.println("Given Array: " +  Arrays.toString(nums) + " Val: " +  val);
        int k =  removeElement(nums,val);

        System.out.println("count of non- matching number: " + k);
        for(int i =0; i < k ; i++)

          System.out.println(nums[i] + " ");
    }
    public static int removeElement(int[] nums, int val) {
        int i= 0;
        int k = 0;

        for( i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return  k;

    }

    @Override
    public String toString() {
        return "RemoveElement{}";
    }
}

//    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
//        Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//        Return k.
//
//     Input: nums = [1,6,3,2,2,3], val = 3
//        Output: 2, nums = [1,6,2,2,_,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
