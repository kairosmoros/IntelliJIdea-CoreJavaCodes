class breakdemo
{
    public static void main(String[] args)
    {
        for (int i=0;i<10 ;i++ )
        {
            if(i%2==0)
            {
                continue;
            }
            if (i==6) break;
            System.out.println(i);
        }
    }
}
