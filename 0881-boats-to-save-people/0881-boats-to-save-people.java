class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int si = 0;
        int ei = people.length-1;
        int count = 0;
        while(si <= ei){
            if(people[si] + people[ei] <= limit){
                si++;
                ei--;
                count++;
            }else{
                ei--;
                count++;
            }
        }
        return count;
    }
}