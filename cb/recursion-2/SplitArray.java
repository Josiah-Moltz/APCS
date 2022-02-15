// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public boolean splitArray(int[] nums) {
  return splitHelper(0,nums,0,0);
}

public boolean splitHelper (int start, int[] nums, int sumA, int sumB) {
  if (start > nums.length -1 && sumA == sumB) {
    return true;
  }
  if (start > nums.length -1) {
    return false;
  }
  return splitHelper(start+1, nums, sumA+nums[start], sumB) || splitHelper(start+1, nums, sumA, sumB+nums[start]);
}
