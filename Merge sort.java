/*
    Author:- Rana Ankit Singh
    
    About:- Implementation of merge sort in Java
*/
public class merge {
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1};

        mergesort(0,arr.length-1,arr);
        for (int x :
                arr) {
            System.out.println(x);
        }
    }

    private static void mergesort(int l,int h,int arr[]){

        if(l<h){
            int mid=(l+h)/2;
            mergesort(l,mid,arr);
            mergesort(mid+1,h,arr);
            merge(l,mid,h,arr);


        }

    }

    private static void merge(int l,int mid, int h, int arr[]){

        int size1=mid-l+1;
        int size2=h-mid;



        int first[]=new int[size1];
        int second[]=new int[size2];





        for (int k = 0; k <size1 ; k++) {
            first[k]=arr[l+k];
        }
        for (int k = 0; k <size2 ; k++) {
            second[k]=arr[mid+1+k];
        }


        int k=l;
        int i=0,j=0;

        while(i<size1 && j<size2){

            if(first[i]<second[j]){
                arr[k]=first[i];
                i++;
            }
            else{
                arr[k]=second[j];
                j++;
            }

            k++;
        }

        while (i<size1){
            arr[k]=first[i];
            i++;
            k++;
        }

        while (j<size2){
            arr[k]=second[j];
            j++;
            k++;

        }


    }
}
