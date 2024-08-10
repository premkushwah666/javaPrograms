#include <stdio.h>

struct employee{
	int empId;
	char empName[20];
	int empSal;
	char empDept[5];
}tcs[5];

void main()
{
	struct employee e1;
	int index;
	clrscr();
	for ( index = 0; index < 5; ++index)
	{
		clrscr();
		printf("\nenter employee id :");
		scanf("%d"&,e1.empId);
		printf("\nenter employee Name :");
		scanf("%s"&,e1.empName);
		printf("\nenter employee Sal :");
		scanf("%d"&,e1.empSal);
		printf("\nenter employee Dep :");
		scanf("%s"&,e1.empDept);
	}
	for ( index = 0; index < 5; ++index)
	{
		printf("%s",e1.empName);
	}
}