#include<stdio.h>
#include<stdlib.h>
struct node
{

	int data;
	struct node *lchild;
	struct node *rchild;
};
typedef struct node *NODE;

NODE getnode(int item)
{
	NODE p;
	p = (NODE)malloc(sizeof(struct node));
	p->data = item;
	p->lchild = NULL;
	p->rchild = NULL;
	return p;
}


NODE insert(NODE root,int item)
{

	if(root == NULL)
		return getnode(item);
	if(item < root->data)
		root->lchild = insert(root->lchild,item);
	else if(item > root->data)
		root->rchild = insert(root->rchild,item);
	return root;
}



void inorder(NODE root){

	if(root == NULL){
		return;	
	}
	inorder(root->lchild);
	printf("%d\t",root->data);
	inorder(root->rchild);
}




void preorder(NODE root)
{
	if(root == NULL)				
		return;
	printf("%d\t",root->data);
	preorder(root->lchild);
	preorder(root->rchild);
}

void postorder(NODE root)
{
	if(root == NULL)
		return;
	
	postorder(root->lchild);
	postorder(root->rchild);
	printf("%d\t",root->data);
}




int maxDepth(NODE root)  
{ 
   if (root==NULL)  
       return 0; 
   else 
   { 
       /* compute the depth of each subtree */
       int lDepth = maxDepth(root->lchild); 
       int rDepth = maxDepth(root->rchild); 
  
       /* use the larger one */
       if (lDepth > rDepth)  
           return(lDepth+1); 
       else 
	   		return(rDepth+1); 
   } 
}  




int search(NODE root,int key){

		while(root!= NULL){
	
		if(key > root->data)
				root = root->rchild;
		else if(key < root->data)
				root = root->lchild;
		else
			return 1;		
			
		}
		
		return 0;
}




//void printLeafNodes(NODE root) 
//{ 
//    // if node is null, return 
//    if (root==NULL) 
//        return; 
//      
//    // if node is leaf node, print its data     
//    if (root->lchild!=NULL && root->rchild !=NULL) 
//    { 
//        printf(root->data);  
//        return; 
//    } 
//  
//    // if left child exists, check for leaf  
//    // recursively 
//    if (root->lchild) 
//       printLeafNodes(root->lchild); 
//          
//    // if right child exists, check for leaf  
//    // recursively 
//    if (root->rchild) 
//       printLeafNodes(root->rchild); 
//}  



void printLeafNodes(NODE root){

  if(root){
    printLeafNodes(root->lchild);
    if(root->lchild ==NULL && root->rchild ==NULL){
      /*Print Leaf node*/
      printf(" %d",root->data);

    }
    printLeafNodes(root->rchild);

  }

}


//// Returns minimum value in a given Binary Tree 
//int findMin(struct Node* root) 
//{ 
//    // Base case 
//    if (root == NULL) 
//      return INT_MAX; 
//  
//    // Return minimum of 3 values: 
//    // 1) Root's data 2) Max in Left Subtree 
//    // 3) Max in right subtree 
//    int res = root->data; 
//    int lres = findMin(root->left); 
//    int rres = findMin(root->right); 
//    if (lres < res) 
//      res = lres; 
//    if (rres < res) 
//      res = rres; 
//    return res; 
//}


int main()
{
	
	NODE root = NULL;
	int ch,elem,maxd,key,op;
	
	while(1){
	
	

	printf("\n 1 - insert \n");
	printf("2 - inorder\n");
	printf("3 - postorder\n");
	printf("4 - preoder\n");
	printf("5 - maxDepth\n");
	printf(" 6 - search\n");
	printf("7 - printLeafNodes");
	printf("8 exit\n");
	printf("Enter your choise: \n");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
			printf("Enter the elemnet to be inserted : \n");
			scanf("%d",&elem);
			root = insert(root,elem);
			break;
			
		case 2:printf(" inorder traversal \n");
			 inorder(root);
			break;
			
		case 3:printf("postotder traversal\n");
			 postorder(root);
			break;
	
		case 4:
			printf("preorder traversal\n");
			 preorder(root);
			break;
	
		case 5:
			 	printf("MAX depth\n");
			 	maxd = maxDepth(root);
			 	printf("%d\n",maxd);
			 	break;
			 	
		case 6: 
				printf("Enter the element to search\n");
				scanf("%d",&key);
				op = search(root,key);
				if(op == 1)
					printf("FOUND\n");
				else
					printf("NOT FOUND!!!!\n");
				break;
				
		case 7:
				printf("Leaf Nodes\n");
				printLeafNodes(root);
				break;
			 	
	    case 8:exit(0);
		
		default: 
			printf("INvalid choise !!!!\n");
			break;
	
	
	}
	
	}
	

}
