public class Armstrong{
/*
public static byte count(int n){
	while(n!=0){

		n/=10;
		c++;
	}
	return c;
}	*/

public boolean isArmstrong(int Number){

int sum=0,temp=Number,r;

		while(Number!=0){
			 r=Number%10;
  			sum=sum+(r*r*r);
  			Number/=10;
		}

		if(sum==temp)
			return true;
		else
			return false;

	}
}