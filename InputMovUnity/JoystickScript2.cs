using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class JoystickScript2 : MonoBehaviour
{

    // Use this for initialization
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        float Directional1 = Input.GetAxis("Directional1");
        float Directional1Y = Input.GetAxis("Directional1Y");
        float Directional2 = Input.GetAxis("Directional2");

        transform.Translate(new Vector2(Directional1 * Time.deltaTime, -Directional1Y * Time.deltaTime));
    }
}
