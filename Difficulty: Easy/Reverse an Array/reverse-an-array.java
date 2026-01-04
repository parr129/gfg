class Solution {
    public void reverseArray(int arr[]) {
        /*while(i<j){
            int temp = a[i];
            a
        }*/
         for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
         
         
        //for(int i = arr.length-1; i >= 0; i--){
        
//list.add(20);

            
            
            
        }
        // code here
        
    }
