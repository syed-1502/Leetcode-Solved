double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int arr[nums1Size+nums2Size];
    int i=0,j=0,k=0;
    int n1=nums1Size;
    int n2 = nums2Size;
    if(n1>=0&&n1<=1000&&n2>=0&&n2<=1000)
    {
        while(i<nums1Size&&j<nums2Size)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k++]=nums1[i++];
                n1--;
            }
            else
            {
                arr[k++]=nums2[j++];
                n2--;
            }
        }
            while (i < nums1Size)
                  arr[k++] = nums1[i++];

            while (j < nums2Size)
                  arr[k++] = nums2[j++];
    }
    double ans=0;
    int val=(nums1Size+nums2Size);
    if(val%2==0)
        ans=(arr[val/2]+arr[(val/2)-1])/2.0;
    else
        ans=arr[val/2]; 
    return ans;
}