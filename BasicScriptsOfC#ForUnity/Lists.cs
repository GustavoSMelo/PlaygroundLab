using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Lists : MonoBehaviour
{

    List<object> valores = new List<object>();
    void Start()
    {
        valores.Add(10);
        valores.Add("Pexes");
        valores.Add(36.0f);
        valores.Add('M');
        valores.Add(true);

        foreach (object sentinel in valores)
        {
            print(sentinel);
        }
    }

    // Update is called once per frame
    void Update()
    {

    }
}
