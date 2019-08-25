import java .util.*;
class array1
{
	public static void main(String args[])
{
		
	
	int ch ,n,a[],i,pos,val,temp;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array element:");
			n=s.nextInt();
			a=new int[20];
			System.out.println("Enter the element for the sorted  array:");
			for(i=0;i<n;i++)
			{ a[i]=s.nextInt();
			}
	
	
		
		do
		{	
			System.out.println("MENU");
			
			System.out.println("1.INSERT");
			System.out.println("2.DELETE");
			System.out.println("3.MERGE");
			System.out.println("4.DISPLAY");
			System.out.println("5.EXIT");
			
			
			System.out.println("Enter the choice:");
			ch=s.nextInt();
			
			switch(ch)
	                    {
				
				case 1:
					
					System.out.println("Enter the position of the new array	element:");								pos=s.nextInt();
pos=pos-1;
					System.out.println("Enter the element to be inserted:");
					val=s.nextInt();
					for( i=n-1;i>=pos;i--)		
						{	a[i+1]=a[i];	}	
					a[pos]=val;
        					n=n+1;
					break;
				case 2:   
														System.out.println("Enter the position of the element to be deleted:");
					pos=s.nextInt();
					pos=pos-1;	
					
				for( i=pos;i<n-1;i++)
				{
					a[i]=a[i+1];
					}
				n=n-1;
				System.out.println("The number is deleted");
					break;
				case 3:
					
				int b[],m,j ,p;
				System.out.println("Enter the size of the second array:");
				m=s.nextInt();
				b=new int[14];
				
				System.out.println("Enter the element for the sorted second array:");
				for(i=0;i<m;i++)
					{
					b[i]=s.nextInt();
					}
				
				
				
        				for(j=0;j<m;j++)
       				 {
               				 a[n+j]=b[j];
       				 }
	  			p=n+m;
		
	 			for(i=0;i<p-1;i++)
				{
					for( j=i+1;j<p;j++)
					{
						if(a[i]>a[j])
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
				}
				
				System.out.println(" array element after merging:");
				n=p;
				for(i=0;i<n;i++)
					{
					System.out.println(+a[i]);
					}
				
					break;
				case 4: 
					for(i=0;i<n;i++)
					{
					System.out.println(+a[i]);	
					}
					break;
					
	                        		case 5: System.out.println(" ");
					break;
				default:
					System.out.println("invalid option");
					
			}
			}while(ch!=5);
		}
}


			


		
		
			
