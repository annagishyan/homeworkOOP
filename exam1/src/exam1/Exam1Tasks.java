package exam1;

public class Exam1Tasks {

    //      1․ գտնել կամայական չափի, լողացող կետով թվերի զանգվածի,  թվերի միջին թվաբանականը։
//            2․Գրել Ծրագիր, որը վերադարձնում 4 թվերից ամենամեծը։
//            3. Գրել Ծրագիր, որը գտնում է զանգվածի ամենամեծ էլեմենտը։
//            4. Գրել Ծրագիր, որը գտնում է զանգվածի 2rd ամենամեծ էլեմենտը։
//

    //1. average
    static double average(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum / arr.length;
    }

    //2. max of the 4 numbers
    static int max(int x, int y, int z, int k) {
        int max = 0;
        if ((x >= y) && (x >= z) && (x >= k))
            max = x;
        else if ((y >= x) && (y >= z) && (y >= k))
            max = y;
        else if ((z >= x) && (z >= y) && (z >= k))
            max = z;
        else
            max = k;

        return max;
    }

    // 3. max of array

    public static void max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        double[] myArr = {1.1, 3.3, 3.5, 1.4, 987, 98.7};
        System.out.println(average(myArr));
        System.out.println(max(3, 4, 1, 5));
        int[] myArray = {34, 12, 1, 65, 87, 12341, 213};
        max(myArray);
    }


}


