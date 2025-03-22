class Solution {
    public int[] countBits(int n) {
        Integer num = new Integer(n);
        int [] result = new int[n+1];
        for(int i =0; i<=n ; i++){
            String binaryString =  num.toBinaryString(i);
            result[i] = ones_occurences(binaryString);
        }
        return result;
    }

    public int ones_occurences(String binaryString){
        int occurences = 0;
        for(int i= 0; i< binaryString.length(); i++){

            if( String.valueOf(binaryString.charAt(i)).equals(String.valueOf(1))){
                occurences++;
            }
        }
        return occurences;
    }
}