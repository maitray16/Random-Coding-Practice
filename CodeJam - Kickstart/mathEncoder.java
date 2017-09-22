class mathEncoder
{
    public static int sumLast(int[] arr, int len)
    {
        int sum=0;
        for(int i=0; i<len; i++)
        {
            sum = sum + (int)(arr[i] * Math.pow(2, len-1-i));
        }
        return sum;
    }

    public static int sumFirst(int[] arr, int len)
    {
        int sum=0;
        for(int i=0; i<len; i++)
        {
            sum = sum + (int)(arr[i] * Math.pow(2, i));
        }
        return sum;
    }

    public static int sumSubset(int[] arr, int len)
    {
        return sumFirst(arr, len) - sumLast(arr, len);
    }

    public static void main(String[] args)
    {
        int[] arr = {3,6,7,9};
        System.out.println(sumSubset(arr, arr.length));
    }
}