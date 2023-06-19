class QuickSort {
    
    static void quickSort(int[] ar, int left, int right) {
        if(left < right){
          int index = partition(ar, left, right);
          quickSort(ar, left, index-1);
          quickSort(ar, index, right);
        }
    }
        
    static int partition(int[] ar, int left, int right){
        int pivot = ar[(left+right)/2];
        while(left <= right){
            while(ar[left] < pivot) left++;
            while(ar[right] > pivot) right--;
            if(left <= right){
                int temp = ar[left];
                ar[left] = ar[right];
                ar[right] = temp;
                
                left++;
                right--;
            }
        }
        return left;
    }
    
    public static void main(String[] args) {
	   int[] ar = {2,6,5,3,8,7,1,0};
	   quickSort(ar, 0, ar.length-1);
	   System.out.println(Arrays.toString(ar));
    }
}
