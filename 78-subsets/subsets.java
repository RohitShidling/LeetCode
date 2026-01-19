class Solution {

    public void getAllSubset(int[] arr,List<Integer> ans,int i,List<List<Integer>> result){
        if(i==arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        getAllSubset(arr,ans,i+1,result);

        ans.remove(ans.size()-1);

        getAllSubset(arr,ans,i+1,result);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getAllSubset(nums, new ArrayList<>(), 0, result);
        return result;
    }
}