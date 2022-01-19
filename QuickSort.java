public class  QucikSort{
    public static void main(String[] args) {
        int[]arr={4,5,1,23,3};
        sort(0,-1);
        System.out.println(Array.toString(arr));
    }
    static void sort(int[] nums, int hi){
        if(low>hi)
        return;
    }
    int s= low;
    int e=hi;
    int m=s+(e-s)/2;
    int pivot = nums[m];

    while(s<=e){
        while(nums[s]<pivot){
            s++; 
        }
        while(nums[e]>pivot){
            e--;
        }
        if(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
}
