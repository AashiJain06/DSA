#include <stdio.h>
struct node
{
  int data;
  struct node *next;
} *start;

struct node *getnode()
{
  struct node *newnode;
  newnode = (struct node *)malloc(sizeof(struct node));
  if (newnode == NULL)
  {
    printf("memory cannot be allocated");
  }
  else
  {
    printf("enter element");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    return newnode;
  }
}
void createlist(int n)
{
  int i;
  struct node *temp, *newnode;
  for (i = 0; i < n; i++)
  {
    newnode = getnode();
    if (start == NULL)
    {
      start = newnode;
    }
    else
    {
      temp = start;
      while (temp->next != NULL)
      {
        temp = temp->next;
      }
      temp->next = newnode;
    }
  }
}
void display()
{
  struct node *temp;
  if (start == NULL)
  {
    printf("list is empty");
  }
  else
  {
    temp = start;
    while (temp != NULL)
    {
      printf("%d\t", temp->data);
      temp = temp->next;
    }
  }
}
void main()
{
  int n;
  printf("enter number of nodes");
  scanf("%d", &n);
  createlist(n);
  display();
}