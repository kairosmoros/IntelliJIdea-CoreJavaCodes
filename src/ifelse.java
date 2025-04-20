class ifelse
{
    public static void main(String[] args)
    {
        int a=100;
        if(a>10)
        {
            System.out.println("chalo samosa khate hain");
            a-=10;//a=90
            if(a>50)//when you use an if block inside and if block then its become nested if
            {
                System.out.println("abhi mere pass paise hain, chalo 50 ki dairy milk le leta hun baaki bache mere pass rupye " +(a));
                a-=50;//a=40
                if (a<50)
                {
                    System.out.println("bhai 40 ka lele jalebi baaki bache hain mere pass rupye " +(a-=40));

                }
            }



        }
        else if(a<10)
        {
            System.out.println("bro paisa kam hai let me check kitne hain" +(a));
        }
        else
        {
            System.out.println("bhai kha boht hai paise");
        }
    }
}

