class Solution {
    public int romanToInt(String s) {
        int count = 0;
        int i = 0;
        while(i < s.length()){
            count+=getRoman(i,s);
            i++;
        }
        return count;
    }
    private int getRoman(int i,String s){
        char ch = s.charAt(i);
        char chPrev = s.charAt(i>0?i-1:0);
        int number = 0;
        int numberPrev = 0;
        if (ch == 'I'){
            number = 1;
        }else if (ch == 'V'){
            number = 5;
        }else if (ch == 'X'){
            number = 10;
        }else if(ch == 'L'){
            number = 50;
        }else if(ch == 'C'){
            number = 100;
        }else if (ch == 'D'){
            number = 500;
        }else{
            number = 1000;
        }
        if (chPrev == 'I'){
            numberPrev = 1;
        }else if (chPrev == 'V'){
            numberPrev = 5;
        }else if (chPrev == 'X'){
            numberPrev = 10;
        }else if(chPrev == 'L'){
            numberPrev = 50;
        }else if(chPrev == 'C'){
            numberPrev = 100;
        }else if (chPrev == 'D'){
            numberPrev = 500;
        }else{
            numberPrev = 1000;
        }
        if (number <= numberPrev){
            return number;
        }else{
            return (number - numberPrev) - numberPrev;
        }
    }
}