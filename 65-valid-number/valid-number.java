/*  trim the string to preprocess it
track number based on constraints like point, e, numbers
remove if other alphabets is present
*/
class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); 
        boolean point = false, eseen = false, numseen = false, numaftere = true;
        int len = s.length();
        for(int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);
            // number tracking
            if(ch >= '0' && ch <= '9'){
                numseen = true;
                numaftere = true;
            }
            // point tracking
            else if(ch == '.')
            {
                if(eseen || point) return false;
                point = true;
            }
            // e tracking
            else if(ch == 'e' || ch == 'E')
            {
                if(eseen || numseen == false) return false;
                numaftere = false;
                eseen = true;
            }
            // sign tracking
            else if(ch == '-' || ch == '+')
            {
                if( i != 0 && ( s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')) return false;
            }
            else return false;
        }
        return numseen && numaftere;
    }
}