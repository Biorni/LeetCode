class Solution {
    public boolean isAnagram(String s, String t) {

        char[] charactersS = s.toCharArray();
        char[] charactersT = t.toCharArray();

        Arrays.sort(charactersS);
        Arrays.sort(charactersT);

        if(charactersS.length!=charactersT.length)
            return false;

        for(int i=0; i<charactersS.length; i++){

            if(charactersS[i] != charactersT[i])
                return false;

        }
        
        return true;
    }
}