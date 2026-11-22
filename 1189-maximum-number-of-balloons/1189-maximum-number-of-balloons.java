class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char[] chs = new char[]{'b','a','l','l','o','o','n'};
        int balloonNum = Integer.MAX_VALUE;
        for(char ch : chs){
            if(ch == 'l' || ch == 'o'){
                balloonNum = Math.min(balloonNum,(map.getOrDefault(ch,0)/2));
            }else{
                balloonNum = Math.min(balloonNum,map.getOrDefault(ch,0));
            }
        }
        return balloonNum;
    }
}