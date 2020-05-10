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

void parenthesisChecker()
{
	int i=0;
	char str[200],rev[200],item;
	printf("Enter a String");
	scanf("%s",str);
	
	while(str[i]!= '\0'){
		item = str[i];
		if(item == '('){
			push(item);
		}else{
			pop();
		}
		++i;
	}
	
	if(top == -1)
		printf("balanced parenthesis");
	else
		printf("unbalanced parenthesis");
}

void main(){
	parenthesisChecker();
}

/*
  input ((()))
  output balanced parenthesis
  
  input (()))
  output unbalanced parenthesis
*/
