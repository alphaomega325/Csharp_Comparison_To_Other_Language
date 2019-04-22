using System;

class Prime{


    public static void Main(){

        int limit = 100000;

        Prime lookup = new Prime();
        float[] result = lookup.Primefind(limit);
        Console.WriteLine("Limit ReachedC#");
/*
        foreach(float e in result){
            if(e == 0)
            {
                break;
            }
            Console.Write(e + " ");
        }
        */

    }



    public float[] Primefind(int limit)
    {

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
