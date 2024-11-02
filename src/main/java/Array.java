public class Array {
    public static void main(String[] args)  {
        int [] array14 = {1,2,3,4,5};
        int [] array15 = {1,-2,3,4,5};
        int [] array16 = {1,2,3,4,5};
        int [] array17 = {1,2,3,4,5};
        int [] array18 = {2,4,14,12,10};
        int excer14 = ex14(array14, 3);
        int excer15 = ex15(array15, 3);
        int excer16 = ex16(array16, array16.length-1, 4);
        boolean excer17 = ex17(array17, array17.length-1, 543);
        boolean excer18 = ex18(array18, array18.length-1);
        System.out.println("14: " + excer14);
        System.out.println("15: " + excer15);
        System.out.println("16: " + excer16);
        System.out.println("17: " + excer17);
        System.out.println("18: " + excer18);


    }

    public static int ex14(int [] array, int n){
        if (n==0) {
            return array[0];
        }
        return array[n]+ex14(array, n-1);
    }

    public static int ex15(int [] array, int n){
        if (n==-1) {
            return 0;
        }
        if (array[n]<0) {
            return ex15(array, n-1);
        }
        return 1+ex15(array, n-1);
    }

    public static int ex16(int [] array, int n, int num) {
        if (n==-1) {
            return -1;
        }
        if (array[n]==num) {
            return n;
        }
        return ex16(array, n-1, num);
    }

    public static boolean ex17(int [] array, int n, int lastn) {
        if (n==-1) {
            return true;
        }
        if (n!=array.length-1) {
            if (array[n]>array[lastn]) {
                return false;
            }
        }
        return ex17(array, n-1, n);

    }

    public static boolean ex18(int [] array, int n) {
        if (n==-1) {
            return true;
        }
        if (ex8(array[n]-1, array[n])==true) {
            return false;
        }

        return ex18(array, n-1);
    }

    public static boolean ex8(int n_minus_one, int n) {
        if (n==1) {
            return false;
        }
        if (n_minus_one==1) {
            return true;
        }
        if (n%(n_minus_one)==0) {
            return false;
        }

        return ex8(n_minus_one-1, n);
    }

}
