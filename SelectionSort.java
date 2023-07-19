public class SelectionSort{

  public static void selectionSort(int[] a, int len){
    if(len < 2) return;

    for(int i=0; i<len-1; i++){
      int iMin = i;
      
      for(int j=i+1; j<len; j++) 
        if(a[j] < a[iMin]) iMin = j;

      if(i != iMin){
        int temp = a[i];
        a[i] = a[iMin];
        a[iMin] = temp;
      }
    }
  }

  public static void main(String [] args){
    int [] a = {3,2,5,1,4};
    selectionSort(a, a.length);
    System.out.println(Arrays.toString(a));
  }
}
