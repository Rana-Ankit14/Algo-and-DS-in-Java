public class quick {
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1};



        quicksort(0,arr.length-1,arr);

        for (int x :
                arr) {
            System.out.println(x);
        }


    }



    private static void quicksort(int l,int h,int arr[]){

        if(l<h){

            int j= partition(l,h,arr);
            quicksort(l,j-1,arr);
            quicksort(j+1,h,arr);
        }


    }


    private static int partition(int l, int h, int arr[]){

        int pivot= arr[l];

        int i=l;
        int j=h;

        while (i<j){


           if (arr[i]<=pivot && i<h){
                i++;
            }

            if (arr[j]>pivot && j>=l){
                j--;
            }

            //i++;j--;
            if(arr[i]>arr[j]){
                swap(i,j,arr);

            }

        }

        if(i>=j){

            swap(l,j,arr);
        }

        return j;
    }


    private static void swap(int a,int b, int arr[]){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

}
