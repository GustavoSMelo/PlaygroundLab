using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ApplyForce : MonoBehaviour
{

    public float Force = 2.5f;
    public Rigidbody2D ball;
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        if (this.gameObject.CompareTag("Ball"))
        {
            if (Input.GetKeyDown(KeyCode.Space))
            {
                ball.AddForce(new Vector2(0, Force * Time.deltaTime), ForceMode2D.Impulse);
            }
        }
    }
}
