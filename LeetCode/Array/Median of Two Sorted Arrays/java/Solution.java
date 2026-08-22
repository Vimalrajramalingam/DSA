class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr[] = new int[n1+n2];
        int index = 0;
        for(int i = 0;i<n1;i++){
            arr[index++] = nums1[i];
        }
        for(int i = 0;i<n2;i++){
            arr[index++] = nums2[i];
        }
        Arrays.sort(arr);
        int s = 0;
        int n = arr.length;
        int mid = n/2;
        if(n%2 == 1){
            return arr[mid];
        }
        else{
            return ((double) arr[mid-1]+arr[mid])/2;
        }
        
    }
}