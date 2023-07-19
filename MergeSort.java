public class MergeSort{

  public static void mergeSort(int[] a, int len){
    if(len < 2) return;

    int mid = len/2;

    int[] l = new int[mid];
    int[] r = new int[len-mid];
    
    for(int i=0; i<mid; i++) l[i] = a[i];
    for(int i=mid; i<len; i++) r[i-mid] = a[i];

    mergeSort(l, mid);
    mergeSort(r, len-mid);

    merge(a, l, r, mid, len-mid);
  }

  public static void merge(int[] a, int[] l, int[] r, int left, int right){
    int i=0, j=0, k=0;

    while(i<left && j<right){
      if(l[i] <= r[j]){
        a[k++] = l[i++];
      } else{
        a[k++] = r[j++];
      }
    }

    while(i<left){
      a[k++] = l[i++];
    }

    while(j<right){
      a[k++] = r[j++];
    }
  }

  public static void main(String [] args){
    int [] a = {3,2,5,1,4};
    mergeSort(a, a.length);
    System.out.println(Arrays.toString(a));
  }
}
