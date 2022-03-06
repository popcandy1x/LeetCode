class relmint{
    public int removeElement(int[] a, int val) {
        int valAppear=0;
        int t=0;
        int k=a.length;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val)
            {
                valAppear++;
            }
        }
        for(int l=0;l<valAppear;l++)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==val)
                {
                    for(int j=i;j<a.length-1;j++)
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
        }
        return k-valAppear;
    }
}