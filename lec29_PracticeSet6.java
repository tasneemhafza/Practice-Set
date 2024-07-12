package PracticeSet;
public class lec29_PracticeSet6 {
    public static void main(String[] args) {
        // // 1. CReate an array of 5 float and print their sum
        // float [] marks = {33.5f, 67.3f,  88.0f, 78.5f, 86.0f};
        // float sum = 0.0f;
        // for(float i: marks) {
        //     sum += i;
        // }
        // System.out.println("The sum is: " + sum);


        // // 2. WAP to findvout whether a given integer is present in the array or not
        // int [] arr = {34, 56, 78, 90, 58, 45};
        // int givenNo = 78;  //should take from the user but im lazy 
        // boolean noPresent = false;
        // for(int arrNo: arr) {
        //     if (givenNo == arrNo) {
        //         noPresent = true;
        //         break;
        //     }
        // }
        // if(noPresent) {
        //     System.out.println("The given numbee is there in the array.");
        // } else {
        //     System.out.println("The given number is not there in the array.");
        // }


        // // 3. Calculate avg marks of the array containing marks of all student in physics by using for-each loop
        // float [] phy = {44.5f, 66.0f, 76.0f, 56.4f, 76.8f};
        // float sum = 0.0f;
        // for(float i: phy) {
        //     sum += i;
        // }
        // System.out.println("The average is : " + sum/phy.length);


        // // 4. WAP to add two matrices of size 2*3
        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 8},
        //                  {3, 7, 1}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};

        // for (int i=0;i<mat1.length;i++){ // row number of times
        //     for (int j=0;j<mat1[i].length;j++) { // column number of time
        //         System.out.format(" Setting value for i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }

        // // Printing the elements of a 2-D Array
        // for (int i=0;i<mat1.length;i++){ // row number of times
        //     for (int j=0;j<mat1[i].length;j++) { // column number of time
        //         System.out.print(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        //     System.out.println(""); // Prints a new line
        // }


        // // 5. WAP to reverse an array
        // int [] arr = {4, 6, 8, 3, 9};
        // int temp;
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // for( int i=0; i<n; i++) {
        //     temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }
        // for(int element: arr){
        //     System.out.print(element + " ");
        // }


        // // 6. WAP to fid maximum element in an array
        // int [] arr = {4, 6, 18, 3, 99};
        // int max=0;  //to find max assign lowest falue first
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i]>max) {
        //         max= arr[i];
        //     }
        // }
        // System.out.println("The maximum element is: " + max); //Ans= 99

        // Another method for this 

        // // 7. WAP to find minimum element
        // int [] arr = {44, 7, 8, 38, 19};
        // int min = Integer.MAX_VALUE;  //to find min assign highest value first
        // for(int element: arr) {
        //     if(element<min)
        //     {
        //         min=element;
        //     }
        // }
        // System.out.println("The minimum value is: " + min);  //Ans= 7


        // 8. WAP to check if array is sorted or not
        int [] arr = {44, 7, 8, 38, 19};
        boolean isSorted= true;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted= false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}
