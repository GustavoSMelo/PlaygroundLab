using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class JSONOfCSharp : MonoBehaviour
{

    Dictionary<string, object> Boss = new Dictionary<string, object>();
    void Start()
    {
        Boss.Add("Name", "Carlinhos, o demoniu");
        Boss.Add("Age", 6823);
        Boss.Add("Resistence", "hexes");
        Boss.Add("Weakness", "Lighting");

        foreach (string sentinel_keys in Boss.Keys)
        {
            print(sentinel_keys + ": " + Boss[sentinel_keys]);
        }
    }

    // Update is called once per frame
    void Update()
    {

    }
}
