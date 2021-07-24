class avgCal
{
public static void main(String[] args)
{
int [] arr={1,2,3,4,5,6,7,8,9,10};
for (int i=0;i<arr.length;i++)
{
System.out.println("Element at "+(i+1)+" is "+arr[i]);
}
int sum=0;
float avg=0;
for(int i=0;i<arr.length;i++)
{
sum+=arr[i];
}
avg=(float) sum/arr.length;
System.out.println("The average is "+avg);
}
}