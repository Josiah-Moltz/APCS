// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public boolean array6(int[] nums, int index) {
  if ( index == nums.length ) {
    return false;
  }
  if ( nums[index] == 6 ) {
    return true;
  }
  return array6( nums, index+1 );
}
