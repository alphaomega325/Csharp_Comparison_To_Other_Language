#include <stdio.h>

double * Primefind(int limit);

void main()
{
  double *result;
  int limit = 100000;
  
  result = Primefind(limit);

  printf("Limit Reached C\n");
  /* int i;
  for(i = 0; i < limit; i++){
    if(*(result + i) == 0)
      {
      break;
      }
    printf("%f ", *(result + i));

  }
  */


}


double * Primefind(int limit){

  int current = 1;
  int test = 1;
  int pointer = 0;
  static double prime[10000];

  while(current < limit)
    {

      if((current % test == 0) && (test == current))
            {
                prime[pointer] = current;
                pointer++;
                current++;
                test = 2;
            }
            else if((current % test == 0) && (test != current))
            {
                current++;
                test = 2;
            }
            else{
                test++;
            }
            
        }
        return prime;

    }


