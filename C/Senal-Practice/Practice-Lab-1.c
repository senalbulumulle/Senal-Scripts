#include <stdio.h>

int main(void) {
    int userNum;
    int userNumSquared;
    
    scanf("%d", &userNum);

    userNumSquared = userNum + userNum; // Bug here; fix it when instructed

    printf("%d", userNumSquared); // Output formatting issue here; fix it when instructed

    return 0;
}