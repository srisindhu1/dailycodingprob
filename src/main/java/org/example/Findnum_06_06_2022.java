package dailycodingproblems;
//An sorted array of integers was rotated an unknown number of times.

//Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.

//For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).
public class Findnumber_06_06_2022 {
    static Integer findnum(int[] arr,int num){
        if(arr==null || arr.length==0){
            return null;
        }
        return find(arr,num,0,arr.length-1);
    }
    public static Integer find(int[] arr,int num,int low,int high){
        int mid=(high+low)/2;
        if(low>high){
            return null;
        }
        if(arr[mid]==num){
            return mid;
        }
        if(arr[low]<=arr[mid]){
            if(arr[low]<num && arr[mid]>=num){
                return find(arr,num,low,mid-1);
            }else{
                return find(arr,num,mid+1,high);
            }
        }
        else{
            if(arr[mid]<=num && num<=arr[high]){
                return find(arr,num,mid+1,high);
            }
            else{
                return find(arr,num,low,mid-1);
                
            }
        }
    }

}
