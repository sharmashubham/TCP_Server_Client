#include <stdio.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <stdlib.h>
#include <string.h>

int main(){
  int req_sock, new_sock;
  char temp[1024];
  int a;
  struct sockaddr_in address;
  struct sockaddr_storage storage;
  socklen_t size;
  req_sock = socket(PF_INET, SOCK_STREAM, 0);
  
  address.sin_family = AF_INET;

  address.sin_port = htons(2000);

  address.sin_addr.s_addr = inet_addr("127.0.0.1");
 
  printf("Server IP Address : 127.0.0.1\n");
  printf("Server Port Number : 2000\n");
 


  memset(address.sin_zero, '\0', sizeof address.sin_zero);  


  bind(req_sock, (struct sockaddr *) &address, sizeof(address));


  if(listen(req_sock,5)==0)
    printf("Waiting\n");
  else
    printf("Error\n");


  size = sizeof storage;
  new_sock = accept(req_sock, (struct sockaddr *) &storage, &size);

  strcpy(temp,"Connection Established with server \n");
  send(new_sock,temp,1024,0);


  recv(new_sock, temp, 1024, 0);
  printf("Data received: %s  \n",temp); 
  
  send(new_sock,temp,1024,0);
    


  return 0;
}
