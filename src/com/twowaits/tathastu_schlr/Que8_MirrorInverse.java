package com.twowaits.tathastu_schlr;

public class Que8_MirrorInverse {

    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {

            // If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }

        // Given array is mirror-inverse
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {

//    int arr[] = { 1, 2, 2, 1 };
     int arr[] = {3, 4, 2, 0, 1};
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
