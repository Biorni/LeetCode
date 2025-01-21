class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> magazineMap = new HashMap<>();
        HashMap<Character,Integer> note = new HashMap<>();

        for(int i=0; i<ransomNote.length(); i++){
            if(!note.containsKey(ransomNote.charAt(i)))
                note.put(ransomNote.charAt(i),1);
            else
                note.put(ransomNote.charAt(i), note.get(ransomNote.charAt(i)) + 1);
        }

        for(int i=0; i<magazine.length(); i++){
            if(note.containsKey(magazine.charAt(i)))
                note.put(magazine.charAt(i), note.get(magazine.charAt(i)) - 1);
        }

        boolean mapIsEmpty = true;
        for (int value : note.values()) {
            if (value > 0) {
                mapIsEmpty = false;
                break;
            }
        }

        return mapIsEmpty;
    }
}