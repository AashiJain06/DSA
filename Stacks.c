#include <stdio.h>
int stack[5];
int top = -1;
int size = 5;
void push(int data)
{
  if (top == size - 1)
  {
    printf("stack is full");
  }
  else
  {
    top = top + 1;
    stack[top] = data;
    printf("%d is inserted", data);
  }
}
void pop()
{
  int item;
  if (top == -1)
  {
    printf("stack is empty");
  }
  else
  {
    item = stack[top];
    top = top - 1;
    printf("deleted item is %d\n", item);
  }
}
void display()
{
  int i;

  for (i = top; i > size; --i)
  {
    printf("%d\t", stack[i]);
  }
}

void main()
{
  push(1);
  push(2);
  display();
  pop();
  display();
}
