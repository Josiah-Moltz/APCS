// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public boolean array220(int[] nums, int index) {
  if ( index >= nums.length-1 ) {
    return false;
  }
  if ( nums[index+1] == 10 * nums[index] ) {
    return true;
  }
  return array220( nums, index+1 );
}
