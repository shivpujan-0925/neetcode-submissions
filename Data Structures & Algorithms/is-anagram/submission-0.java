class Solution {
    public boolean isAnagram(String s, String t) {
        //convert to lower case;
         s = s.toLowerCase();
         t = t.toLowerCase();

        //check both string length
        if((s.length()) == ( t.length())){
            //convert string into chars array
             char[] str1 = s.toCharArray();
             char[] str2 = t.toCharArray();

             //sorting array
              Arrays.sort(str1);
              Arrays.sort(str2);

             boolean result = Arrays.equals(str1,str2);

             if(result) {
                return true;
             }else{
                return false;
             } 

        }else{
           return false;
        }


    }
}
