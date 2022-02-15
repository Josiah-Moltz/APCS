// MNM: Mosiah, Nora Miller
// APCS pd6
// HW61: Instructions so Simple...
// 2022-02-07
// time spent: .8 hrs

public boolean groupSum(int start, int[] nums, int target) {
  if (target == 0) {
    return true;
  }
  if (start > nums.length-1) {
    return false;
  }
  return groupSum( start+1, nums, target-nums[start] ) || groupSum( start+1, nums, target);
}
