#include<stdio.h>
#include<conio.h>
char s[200];
int top = -1;
void push(char item){
	s[++top] = item;
}

void display(){
	int i;
	
	if(top == -1)
		printf("No elemnts");
	for(i=0;i<=top;++i){
		printf("%d\t",s[i]);
	}
}
void decToBin()
{
	int num,rem;
	printf("Enter Number to be converted");
	scanf("%d",&num);
	while(num!=0){
		rem = num%2;
		num = num/2;
		push(rem);
	}
	display();
}

void main(){
	decToBin();
}

/*
  input 45
  output 101101
*/
