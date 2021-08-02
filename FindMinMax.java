public class FindMinMax {
    int[] A;
    
    FindMinMax(int[] A)// constuructor for initializing A
    {
        this.A=A;
    }



    public void printMinMax()//method that will be called from Runner
    {
        int[] Result=findMinmax(0, A.length-1);
        for(int i:Result)
        {
            System.out.println(i);
        }

    }
    public int[] findMinmax(int low, int high) // The method to be recursively called; low is lower bound high is higher bound
    {
        if(low==high)
        {
            int[] res={high,low};
            return res;
        }
        if(low==(high-1))
        {
            int res[]=new int[2];
            if(A[low]>A[high])
            {
                res[0]=A[low];
                res[1]=A[high];
                return res;

            }
            else{
                res[0]=A[high];
                res[1]=A[low];
                return res;
            }
        }



        int[] leftMaxMin=findMinmax(low, (low+high)/2);
        int[] rightMaxMin=findMinmax(((low+high)/2),high);


        int max1=leftMaxMin[0];
        int max2=rightMaxMin[0];
        int min1=leftMaxMin[1];
        int min2=rightMaxMin[1];
        int finalResult[]=new int[2];
        if(max1>max2)
        {
            finalResult[0]=max1;
        }
        else
        {
            finalResult[0]=max2;
        }
        if(min1<min2)
        {
            finalResult[1]=min1;
        }
        else
        {
            finalResult[1]=min2;
        }
        return finalResult;

    }
    
    
}
