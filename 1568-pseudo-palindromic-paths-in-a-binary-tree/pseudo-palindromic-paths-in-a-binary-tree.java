class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        return psuedoPalindrome_helper ( root , 0 );
    }
    int psuedoPalindrome_helper ( TreeNode proc , int res )
	 {
	    if(proc == null) return 0;
		res = res ^ ( 1 << proc.val );
		if ( proc.left == null && proc.right == null )
		{
		   return ( res == 0 ||isPowerOfTwo(res)) ? 1 : 0;
		}
		return psuedoPalindrome_helper ( proc.left , res ) + psuedoPalindrome_helper ( proc.right , res );
	 }
	 boolean isPowerOfTwo ( int val )
	 {
	    return (val > 0) && ((val & (val - 1)) == 0);
	 }
}