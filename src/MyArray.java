public class MyArray {

    public static int[] numArray = {1,2,3,4,99,5};

    public  static int[][] multiNumArray =
            {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

    public static int[] getNumArray() {
        return numArray;
    }

    public void setNumArray(int[] numArray) {
        this.numArray = numArray;
    }

    public static void main(String[] args) {
        String[] strArr = {"a", "b", "c"};
        double idxOneDouble = 1.0;
        int idxOneInt = 1;
//        System.out.println(strArr[idxOneDouble]); // * throw Error
        System.out.println(strArr[idxOneInt]);
    }
}
