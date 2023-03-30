class Armstrong {
    public static void main(String[] args) {
        int i, a,b,c=0;
        System.out.print("Armstrong numbers from 1 to 1000 is :");
        for (i = 1; i <= 1000; i++)
        {
            a = i;
            while(a > 0)
            {
                b = a % 10;
                c = c + (b * b* b);
                a = a / 10;
            }
            if(c == i)
            {
                System.out.println(i);
            }
            c=0;
        }
    }
}
