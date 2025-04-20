class breakdemo3
{
    public static void main(String[] args)
    {
        for (int i=0;i<3 ;i++ )
        {
            for(int j=0; j<2; j++)

            {
                if (j==1) break;

                System.out.println("output of j is " +j);

            }
            System.out.println("output of i is " +i);
        }
    }
}
