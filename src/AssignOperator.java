class AssignOperator
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println("if a = b then a is " +(a=b));//a=20
        System.out.println("if a=a+b then a is " +(a+=b));//a=40
        System.out.println("if a=a-b then a is" +(a-=b));//a=20
        System.out.println("if a=a/b then a is " +(a/=b));//a=1
        System.out.println("if a=a%b then a is " +(a%=b));//a=1
    }
}
