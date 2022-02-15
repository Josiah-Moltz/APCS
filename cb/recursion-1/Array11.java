// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public int array11(int[] nums, int index) {
  if ( index == nums.length ) {
    return 0;
  }
  if ( nums[index] == 11 ) {
    return 1 + array11( nums, index+1 );
  }
  return array11( nums, index+1 );
}
