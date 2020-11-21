import java.util.Arrays

fun main(args: Array<String>) {
    val nums = intArrayOf(5, 3, 1, 4, 2)
    println(Arrays.toString(nums))
    for(i in 0 until (nums.size -1))
        for(j in 0 until (nums.size -i -1))
            if(nums[j] > nums[j+1]){
                var temp = nums[j]
                nums[j] = nums[j+1]
                nums[j+1] = temp
            }
    println(Arrays.toString(nums))
}