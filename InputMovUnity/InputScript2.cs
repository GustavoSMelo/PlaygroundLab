using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class InputScript2 : MonoBehaviour
{

    // Use this for initialization
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        float horizontalControl = Input.GetAxis("Horizontal");
        float verticalControl = Input.GetAxis("Vertical");

        transform.Translate(new Vector2(horizontalControl * Time.deltaTime, verticalControl * Time.deltaTime));
    }
}
