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

void complexparenthesisChecker()
{
	int i=0;
	char str[200],rev[200],item;
	printf("Enter a parenthsis");
	scanf("%s",str);
	
	while(str[i]!= '\0'){
		item = str[i];
		if(item == '(' || item == '[' || item == '{'){
			push(item);
		}else if( item == ')' && s[top] == '(' ||item == ']' && s[top] == '[' ||item == '}' && s[top] == '{'){
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
	complexparenthesisChecker();
}

/*
  input {[()]}
  output balanced parenthesis
  
  input ([[]})
  output unbalanced parenthesis
*/
