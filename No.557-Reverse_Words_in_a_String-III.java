class Solution {
    public String reverseWords(String s) {
        char[] A = s.toCharArray();    
        for(int start = 0,end =0; end<A.length;end++){
            int end_index;
            if(A[end]==' '){
                end_index = end-1;
                for(int i = start ; i<=end_index ;i++){
                    char tmp = A[i];
                    A[i] = A[end_index];
                    A[end_index] = tmp;
                    end_index--;
                }
                start = end +1;
            }
            if(end == A.length-1){
                end_index = end;
                for(int i = start ; i<=end_index ;i++){
                    char tmp = A[i];
                    A[i] = A[end_index];
                    A[end_index] = tmp;
                    end_index--;
                }
            }
        }
        
        return String.valueOf(A);
    }
}
