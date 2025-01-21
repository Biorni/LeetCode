class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length())
            return false;

        HashMap<Character,Integer> note = new HashMap<>();

        for(char c: ransomNote.toCharArray()){
            if(!note.containsKey(c))
                note.put(c,1);
            else
                note.put(c, note.get(c) + 1);
        }

        for(char c: magazine.toCharArray()){
            if(note.containsKey(c))
                note.put(c, note.get(c) - 1);
        }

        for (int value : note.values()) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }
}