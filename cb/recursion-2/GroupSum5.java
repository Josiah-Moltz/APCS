// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public boolean groupSum5(int start, int[] nums, int target) {
  if (target == 0 && start > nums.length-1) {
    return true;
  }
  if (start > nums.length-1) {
    return false;
  }
  if ( nums[start] %5 == 0 ) {
    if ( start < nums.length - 1 && nums[start+1] == 1 ) {
      return groupSum5( start+2, nums, target-nums[start]);
    }
    return groupSum5( start+1, nums, target-nums[start]);
  }
  return groupSum5( start+1, nums, target-nums[start] ) || groupSum5( start+1, nums, target);
}
