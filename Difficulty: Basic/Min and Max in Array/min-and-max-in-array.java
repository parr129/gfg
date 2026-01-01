class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        result.add(arr[0]);
        result.add(arr[arr.length-1]);
        
        return result;


          
        
    }
}
