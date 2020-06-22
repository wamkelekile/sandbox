
public class Cat {

    public static void main(String[] args)
    {
        int[] integerArray = {4, 2, 6, 8, 1, 3, 7, 5};
        //int[] integerArray = {1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println(f(integerArray, integerArray.length));

    }

    public static int f(int[] x, int n)
    {
        int i, k = 0;

        if (n <= 0)
            return -1;

        i = 1;

        while (i < n)
        {
            if (x[k] > x[i])
            {
                k = i;
            }

            i = i + 1;

        }
        return  k;

    }
}
