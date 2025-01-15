class Solution {
    public int maxPower(String s) {

        int maxPower = 1;
        int power = 1;

        if(s.equalsIgnoreCase("") || s == null)
            return maxPower;

        for(int i=0; i<s.length()-1; i++){
            if( s.charAt(i) == s.charAt(i+1)){
                power++;
                if(maxPower < power){
                    maxPower = power;
                }
            }else{
                power = 1;
            }
        }

        return maxPower;
    }
}