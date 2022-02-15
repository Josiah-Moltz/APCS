// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public boolean groupNoAdj(int start, int[] nums, int target) {
  if (target == 0 && start > nums.length-1) {
    return true;
  }
  if (start > nums.length-1) {
    return false;
  }
  return groupNoAdj( start+2, nums, target-nums[start] ) || groupNoAdj( start+1, nums, target);
}
