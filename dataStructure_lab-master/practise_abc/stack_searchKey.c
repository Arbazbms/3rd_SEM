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

void searchKey()
{
	int key,i,temp;
	if(top == -1){
		printf("Search not possible!");
	}else{
		printf("enter a key to search");
		scanf("%d", &key);
		for(i=top;i>=0;i--){
			temp = pop();
			if(temp == key){
				printf("Key Found");
				getch();
				exit(0);
			}
		}
		printf("Key Not Found!");
		
	}
}

void main(){
	
		int choise,new_elem,x;
		while(1){
		printf("\n 1  push \n");
		printf("2 - pop \n");
		printf("3 - display\n");
		printf("4 - Search For a key in stack\n");
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
					
			case 4: searchKey();
					break;
					
			case 5: exit(0);
			
			default:
					printf("Wrong input!! :) \n");
		}
		
	}
}
