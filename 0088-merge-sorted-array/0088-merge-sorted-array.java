class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = Arrays.copyOf(nums1, m);

        for (int i = 0; i < n; i++) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[m + i] = nums2[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
