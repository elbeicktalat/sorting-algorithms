let nums = [5, 3, 1, 4, 2];
console.log(nums);

for(let i = 0, size = nums.length; i < size -1; i++)
    for(let j = 0; j < size -i -1; j++)
        if(nums[j] > nums[j +1]){
            let temp = nums[j];
            nums[j] = nums[j+1];
            nums[j+1] = temp;
        }

console.log("Array sorted with buuble sort:\n" + nums);