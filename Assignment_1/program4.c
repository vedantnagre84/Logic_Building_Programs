#include <stdio.h>

void checkDivisible(int num) {
    if(num % 5 == 0) {
        printf("The number is divisible by 5");
    } else {
        printf("The number is not divisible by 5");
    }
}

int main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    checkDivisible(num);

    return 0;
}
