#include <stdio.h>
int main() {

  char num;
  double m, n;
  printf("Choose from below:\n");
  printf("1.Addition\n");
  printf("2.Substraction\n");
  printf("3.Multiplication\n");
  printf("4.Division\n");
  scanf("%c", &num);
  printf("Enter two nos: \n");
  scanf("%lf %lf", &m, &n);
  switch (num) {
    case '1':
      printf("%.1lf + %.1lf = %.1lf\n", m, n, m+n);
      break;
    case '2':
      printf("%.1lf - %.1lf = %.1lf\n", m, n, m-n);
      break;
    case '3':
      printf("%.1lf * %.1lf = %.1lf\n", m, n, m*n);
      break;
    case '4':
      printf("%.1lf / %.1lf = %.1lf\n", m, n, m/n);
      break;
    default:
      printf("Error!");
  }
  return 0;
}