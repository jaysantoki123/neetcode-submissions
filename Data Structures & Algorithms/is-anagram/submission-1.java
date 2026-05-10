class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
          if(map.containsKey(t.charAt(i))){
            int key = map.get(t.charAt(i));
            if(key > 1){
              map.put(t.charAt(i) , key-1);
            }else{
              map.remove(t.charAt(i));
            }
          }
        }

        if(map.isEmpty()){
          return true;
        }else{
          return false;
        }
    }
}
