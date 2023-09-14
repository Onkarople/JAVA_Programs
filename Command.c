#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])

{
    int ans=0;
    printf("name of excutable is %s\n",argv[0]);



   printf("number of command line argumrnts are : %d \n",argc);

    ans = atoi(argv[1]) + atoi(argv[2]);
    printf("adiiton is :%d\n",ans);


    return 0;


}