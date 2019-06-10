#include<stdio.h>
int main()
{
  int length=6, breadth=9, perimeter,area;
  area=length*breadth;
  perimeter=2*(length+breadth);
  printf("The perimeter of the rectangle is: %d cm\nThe area of the rectangle is: %d sq cm", perimeter,area);
  return 0;
}