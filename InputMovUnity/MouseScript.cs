using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MouseScript : MonoBehaviour
{

    // Use this for initialization
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        //float mouseHorizontal = Input.GetAxis("Mouse X");
        float mouseScroll = Input.GetAxis("Mouse ScrollWheel");
        float mouseVertical = Input.GetAxis("Mouse Y");
        transform.Translate(new Vector2(mouseScroll * Time.deltaTime, mouseVertical * Time.deltaTime));
    }
}
