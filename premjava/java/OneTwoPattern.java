class Zero{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || j==1 || i==n || j==n ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class One{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==n || j==n/2+1 || (j+i==n/2+2&&j!=1) ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Two{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || i==n || i==n/2+1 || j==1&&i>n/2+1  || j==n&&i<n/2+1 ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Three{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || i==n || i==n/2+1 ||j==n ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Four{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if(  i==n/2+1 || j==1&&i<n/2+1  || j==n ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Five{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || i==n || i==n/2+1 || j==n&&i>n/2+1  || j==1&&i<n/2+1 ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Six{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || i==n || i==n/2+1 || j==n&&i>n/2+1  || j==1 ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Seven{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || i+j==n+1) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Eight{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( i==1 || i==n || i==n/2+1 || j==n  || j==1 ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


class Nine{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( (j==1&&i<n/2+1)|| i==n  || j==n  || i==1 || i==n/2+1 ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}