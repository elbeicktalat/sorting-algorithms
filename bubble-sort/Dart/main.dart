void main() {
  List<int> nums = [5, 3, 10, 4, 2, 15, 25, 20];
  print(nums);

  for (int i = 0, size = nums.length; i < size - 1; i++)
    for (int j = 0; j < size - i - 1; j++)
      if (nums[j] > nums[j + 1]) {
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;
      }

  print(nums);
}
