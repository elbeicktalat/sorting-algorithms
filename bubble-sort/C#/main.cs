using System;

class BubbleSort {
    static void Main(string[] args){
        int[] nums = {5, 3, 1, 4, 2};
        for(int i = 0, size = nums.Length; i < size -1; i++)
        for(int j = 0; j < size -i -1; j++)
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
    Console.WriteLine(String.Join(",", nums));
    }
}
