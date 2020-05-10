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

void strrev()
{
	int i=0,j;
	char str[200],rev[200],item;
	printf("Enter a String");
	gets(str);
	
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
	printf("%s", rev);
	
}

void main(){
	strrev();
}

/*
input all is well
output llew si lla

*/
