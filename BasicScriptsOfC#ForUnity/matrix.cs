using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class matrix : MonoBehaviour
{

    int[,] matriz = new int[2, 2];
    void Start()
    {
        matriz[0, 0] = 1;
        matriz[0, 1] = 2;
        matriz[1, 0] = 3;
        matriz[1, 1] = 4;


        for (int i = 0; i <= 1; i++)
        {
            for (int z = 0; z <= 1; z++)
            {
                print("Na linha: " + i + " columa: " + z + " tem: " + matriz[i, z]);
            }
        }

    }

    // Update is called once per frame
    void Update()
    {

    }
}
