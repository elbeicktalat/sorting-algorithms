import java.util.Arrays;

public class BubbleSort{

    public static void main(String []args){
    
    int[] nums = {5, 3, 1, 4, 2};
    System.out.println(Arrays.toString(nums));

    for(int i = 0, size = nums.length; i < size -1; i++)
        for(int j = 0; j < size -i -1; j++)
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
    System.out.print(Arrays.toString(nums));
    }

}