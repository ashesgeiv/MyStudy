#include<stdio.h>
#include<malloc.h>

typedef struct element {
	char data;
	struct student* next;
}LinkList;
//初始化

LinkList* creat(int n) {
	LinkList* head, * node, * end;
	head = (LinkList*)malloc(sizeof(LinkList));
	end = head;         
	for (int i = 0; i < n; i++) {
		node = (LinkList*)malloc(sizeof(LinkList));
		scanf("%c", &node->data);
		end->next = node;
		end = node;
	}
	end->next = NULL;
	return head;
}

//改内容  
void change(LinkList* list, int n) {//n为第n个节点
	LinkList* t = list;
	int i = 0;
	while (i < n && t != NULL) {
		t = t->next;
		i++;
	}
	if (t != NULL) {
		puts("输入要修改的值");
		scanf("%c", &t->data);
	}
	else {
		puts("节点不存在");
	}
}
//删节点
void delet(LinkList* list, int n) {
	LinkList* t = list, * in;
	int i = 0;
	while (i < n && t != NULL) {
		in = t;
		t = t->next;
		i++;
	}
	if (t != NULL) {
		in->next = t->next;
		free(t);
	}
	else {
		puts("节点不存在");
	}
}

void insert(LinkList* list, int n) {
	LinkList* t = list, * in;
	int i = 0;
	while (i < n && t != NULL) {
		t = t->next;
		i++;
	}
	if (t != NULL) {
		in = (LinkList*)malloc(sizeof(LinkList));
		puts("输入要插入的值");
		scanf("%c", &in->data);
		in->next = t->next;//填充in节点的指针域，也就是说把in的指针域指向t的下一个节点
		t->next = in;//填充t节点的指针域，把t的指针域重新指向in
	}
	else {
		puts("节点不存在");
	}
}
void show(LinkList* h) {
	while (h->next != NULL) {
		h = h->next;
		printf("%d  ", h->data);
	}
}
int main() {
	char ch;
	LinkList* h;
	int num;
	while ((ch=getchar)!='q')
	{
		printf("请选择你要用的功能,按q退出\n");
		printf("a,初始化\tb，插入元素\n");
		printf("c,删除元素\td,统计元素");
		if ('\n'==ch)
		{
			continue;
		}
		else
		{
			switch (ch)
			{
			case 'a':
				
				scanf("%d", &num);
				h = creat(num);
				break;
			case 'b':
				printf("要插入到几号元素之后\n");
				scanf("%d", &num);
				insert(h, num);
				break;
			case 'c':
				printf("要插入到几号元素之后\n");
				int num;
				scanf("%d", &num);
				delete(head, num);
				break;
			case 'd':
			default:
				break;
			}
		}
	}
	
}