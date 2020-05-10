#include<stdio.h>
#include<conio.h>
char s[200];
int top = -1;
void push(char item){
	s[++top] = item;
}

int pop(){
	return s[top--];
}

void display(){
	int i;
	if(top == -1)
		printf("No elemnts");
	for(i=0;i<=top;++i){
		printf("%d\t",s[i]);
	}
}

void SearchMAX()
{
	
	int max,i,temp;
	if(top == -1){
		printf("Search not possible\n");
	}
	else{
		max = -9999;
		for(i=top; i>=0; i--){
			temp = pop();
			if(temp > max)
				max = temp;
		}
		printf("Max number is %d\n", max);
	}
}

void main(){
	
		int choise,new_elem,x;
		while(1){
		printf("\n 1  push \n");
		printf("2 - pop \n");
		printf("3 - display\n");
		printf("4 - search for a MAX number\n");
		printf("5 - Exit\n");
		printf("Enter your choise:  \n");
		scanf("%d",&choise);
		
		switch(choise)
		{
			case 1: 
					printf("Enter the element to be pushed into the stack:  \n");
					scanf("%d",&new_elem);
					push(new_elem);
					printf("element %d is pushed into the stack\n",new_elem);
					break;
			
			case 2: x = pop();
					
				    printf("element %d is succesfully deleted from the stack \n",x);
					break;
					
			case 3: display();
					break;
					
			case 4: SearchMAX();
					break;
					
			case 5: exit(0);
			
			default:
					printf("Wrong input!! :) \n");
		}
		
	}
}
