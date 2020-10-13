#include <stdio.h>
#include <string.h>

int main()
{
	int i = 0, n;
	int j = 0;

	char str[]="  Sen al Bul umulle ";
	char ptr, ptr1;
	printf("sizeof str:%ld\n", strlen(str));
	while(str[i]==' ')
	{
		memcpy (str, str + 1, strlen(str)+1);
	}    
	printf("size of str:%ld\n", strlen(str));
	n=strlen(str);
	while(str[n]== ' ' || str[n]=='\0')
	n--;
	str[n+1]='\0';
	printf("str: %s ", str);
	printf("sizeof str:%ld\n", strlen(str));
}
