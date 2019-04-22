import java.io.*;

public class Main{


    public static void main(String[] args){

	int limit = 100000;

	Main lookup = new Main();

	float[] result = lookup.Primefind(limit);

	System.out.println("Limit Reached Java");
	/*	for(int i = 0; i < result.length; i++)
	    {

		if(result[i] == 0)
		    {
			break;
		    }
		System.out.print(result[i] + " ");

	    }
	*/


    }

    public float[] Primefind(int limit){

	float current = 1;
	float test = 1;
	int pointer = 0;
	float[] prime = new float[limit];
	
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

}
