#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

typedef struct node * NODE;

NODE getnode() {
    NODE p;
    p = (NODE) malloc(sizeof(struct node));
    if (p != NULL) return p;
    else {
        printf("No Memory \n");
        return NULL;
    }
}

NODE insert_front(int item, NODE head) {
    NODE p;
    p = getnode();
    p -> data = item;
    p -> next = head;
    head = p;
    printf("Inserted \n");
    return head;
}

NODE insert_back(int item, NODE head) {
    NODE p, q;
    q = getnode();
    q -> data = item;
    q -> next = NULL;
    if (head == NULL) return q;
    p = head;
    while (p -> next != NULL) p = p -> next;
    p -> next = q;
    printf("Inserted \n");
    return head;
}



NODE display (NODE head) {
    NODE p;
    if (head == NULL) {
        printf("Empty List \n");
        return;
    }
    p = head;
    while (p != NULL) {
        printf("%d \t", p -> data);
        p = p -> next;
    }
    printf("\n");
}


NODE deletefront(NODE head) {
	NODE p = head;
	if (head == NULL) {
		printf("Empty \n");
		return head;
	}
	else{
		printf("Deleted \n");
		head = p -> next;
		free(p);
		return head;
	}
	
}


NODE deleterear(NODE head) {
	NODE p = head, prev;
	if (head == NULL) {
		printf("Empty \n");
		return NULL;
	}
	if (head -> next == NULL) {
		printf("Deleted \n");
		return NULL;
	}
	while (p -> next != NULL) {
		prev = p;
		p = p -> next;
	}
	free(p);
	prev -> next = NULL;
	return head;
}


int main() {
    int choice, pos, ele;
    NODE head = NULL;
    
    while(1){
	
        printf("1. Enter from Front \n");
        printf("2. Enter from End \n");
        printf("3. delete from front \n");
 		printf("4. delete from rear\n");
        printf("5. Display \n");
		printf("6. Exit \n");
        printf("Enter Choice \n");
        scanf("%d", &choice);
        
        switch (choice) {
            case 1: printf("Enter Element \n");
                    scanf("%d", &ele);
                    head = insert_front(ele, head);
                    break;
            
            case 2: printf("Enter Element \n");
                    scanf("%d", &ele);
                    head = insert_back(ele, head);
                    break;
                    
            case 3: head = deletefront(head);
                    break;
            
			case 4: head = deleterear(head);
                    break;
					        
            case 5: display(head);
                    break;

		    case 6: exit(0);
                    break;
            
            default: printf("Invalid Choice \n");
        }
        
        
    }

    return 0;
}
