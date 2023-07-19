public class BubbleSort{

  public static void bubbleSort(int[] a, int len){
    if(len < 2) return;

    for(int i=0; i<len-1; i++){
      for(int j=i+1; j<len; j++){
        if(a[i] > a[j]){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static void main(String [] args){
    int [] a = {3,2,5,1,4};
    bubbleSort(a, a.length);
    System.out.println(Arrays.toString(a));
  }
}
