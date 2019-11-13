
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#pragma warning(disable:4996)
#define ElementType char //�洢����Ԫ�ص�����
#define MAXSIZE 6 //�洢����Ԫ�ص�������
#define ERROR -99 //ElementType������ֵ����־����

typedef struct {
	ElementType data[MAXSIZE];
	int front; //��¼����ͷԪ��λ��
	int rear; //��¼����βԪ��λ��
	int size; //�洢����Ԫ�صĸ���
}Queue;

Queue* CreateQueue() {
	Queue* q = (Queue*)malloc(sizeof(Queue));
	if (!q) {
		printf("�ռ䲻��\n");
		return NULL;
	}
	q->front = -1;
	q->rear = -1;
	q->size = 0;
	return q;
}

int IsFullQ(Queue* q) {
	return (q->size == MAXSIZE);
}

void AddQ(Queue* q, ElementType item) {
	if (IsFullQ(q)) {
		printf("��������\n");
		return;
	}
	q->rear++;
	q->rear %= MAXSIZE;
	q->size++;
	q->data[q->rear] = item;
}

int IsEmptyQ(Queue* q) {
	return (q->size == 0);
}

ElementType DeleteQ(Queue* q) {
	if (IsEmptyQ(q)) {
		printf("�ն���\n");
		return ERROR;
	}
	q->front++;
	q->front %= MAXSIZE; //0 1 2 3 4 5
	q->size--;
	return q->data[q->front];
}

void PrintQueue(Queue* q) {
	if (IsEmptyQ(q)) {
		printf("�ն���\n");
		return;
	}
	printf("��ӡ��������Ԫ�أ�\n");
	int index = q->front;
	int i;
	for (i = 0; i < q->size; i++) {
		index++;
		index %= MAXSIZE;
		printf("%c ", q->data[index]);
	}
	printf("\n");
}

int main(int argc, const char* argv[]) {
	Queue* q = CreateQueue();
	char ch;
	char data;
	printf("Ĭ���Ѵ������У���ѡ��\n");
	printf("1,�����\n");
	printf("2��������\n");
	printf("3.����\n");
	while ((ch=getche())!='q')
	{
		switch (ch)
		{
		case '1':
			printf("�������ֵ");
			data = getche();
			AddQ(q,data);
			PrintQueue(q);
			break;
		case '2':
			DeleteQ(q);
			PrintQueue(q);
			break;
		case '3':PrintQueue(q);
			break;
		
		default:
			break;
		}
		printf("\n������\n");
	}
	

	return 0;
}