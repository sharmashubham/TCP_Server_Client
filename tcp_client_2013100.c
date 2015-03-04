#include <stdio.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <stdlib.h>
#include <string.h>


int main(){
  int ser_sock;
  char temp[1024];
  struct sockaddr_in address;
  socklen_t size;

  ser_sock = socket(PF_INET, SOCK_STREAM, 0);




  address.sin_family = AF_INET;

  address.sin_port = htons(2000);

  
  address.sin_addr.s_addr = inet_addr("127.0.0.1");
  memset(address.sin_zero, '\0', sizeof address.sin_zero);  

   printf("The cLient is connecting to server with port number : 2000\n"); 









  size = sizeof address;
  connect(ser_sock, (struct sockaddr *) &address, size);










  recv(ser_sock, temp, 1024, 0);






  printf("Status: %s \n",temp);   

  




  


  printf("Enter text \n");
   char str[1024];
    if (fgets(str, sizeof str, stdin)) {
        strcpy(temp,str);
        send(ser_sock,temp,1024,0);


   }
  recv(ser_sock, temp, 1024, 0);
  int i ;
  int count = 0;
for (i = 0;temp[i] != '\0';i++)
    {
        if (temp[i] == ' ')
            count++;    
    }

 printf("The space count is %d\n",count);
printf("The word count is %d\n",count+1);
 

return 0;
}
