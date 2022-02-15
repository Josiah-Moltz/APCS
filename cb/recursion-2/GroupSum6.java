// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public boolean groupSum6(int start, int[] nums, int target) {
  if (target == 0 && start > nums.length-1) {
    return true;
  }
  if (start > nums.length-1) {
    return false;
  }
  if ( nums[start] == 6 ) {
    return groupSum6( start+1, nums, target-nums[start] );
  }
  return groupSum6( start+1, nums, target-nums[start] ) || groupSum6( start+1, nums, target);
}
