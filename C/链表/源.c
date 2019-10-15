#include<stdio.h>
#include<malloc.h>

typedef struct element {
	char data;
	struct student* next;
}LinkList;
//��ʼ��

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

//������  
void change(LinkList* list, int n) {//nΪ��n���ڵ�
	LinkList* t = list;
	int i = 0;
	while (i < n && t != NULL) {
		t = t->next;
		i++;
	}
	if (t != NULL) {
		puts("����Ҫ�޸ĵ�ֵ");
		scanf("%c", &t->data);
	}
	else {
		puts("�ڵ㲻����");
	}
}
//ɾ�ڵ�
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
		puts("�ڵ㲻����");
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
		puts("����Ҫ�����ֵ");
		scanf("%c", &in->data);
		in->next = t->next;//���in�ڵ��ָ����Ҳ����˵��in��ָ����ָ��t����һ���ڵ�
		t->next = in;//���t�ڵ��ָ���򣬰�t��ָ��������ָ��in
	}
	else {
		puts("�ڵ㲻����");
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
		printf("��ѡ����Ҫ�õĹ���,��q�˳�\n");
		printf("a,��ʼ��\tb������Ԫ��\n");
		printf("c,ɾ��Ԫ��\td,ͳ��Ԫ��");
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
				printf("Ҫ���뵽����Ԫ��֮��\n");
				scanf("%d", &num);
				insert(h, num);
				break;
			case 'c':
				printf("Ҫ���뵽����Ԫ��֮��\n");
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