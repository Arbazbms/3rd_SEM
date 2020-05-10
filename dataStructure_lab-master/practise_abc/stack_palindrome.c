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

void strpal()
{
	int i=0,j;
	char str[200],rev[200],item;
	printf("Enter a String");
	scanf("%s", str);
	
	while(str[i]!= '\0'){
		item = str[i];
		push(item);
		++i;
	}
	
	j=0;
	while(top!=-1){
		rev[j] = pop();
		++j;
	}
	rev[j] = '\0';
	if(strcmp(str,rev)==0)
		printf("String is Palindrome");
	else
		printf("String is not a Palindrome");
	
}

void main(){
	strpal();
}

/*
  input madam
  output String is a palindrome
  
  input cat
  output String is not a palindrome
*/
