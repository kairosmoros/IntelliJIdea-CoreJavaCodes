class forloop
{
    public static void main(String[] args)
    {
        int []arr = new int[5];
        int c=10;
        for (int i=0; i<5; i++ )
        {
            arr[i]=c;
            c=c+10;
            System.out.println(arr[i]);
        }
    }
}
