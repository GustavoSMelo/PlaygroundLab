using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ApplyForce2 : MonoBehaviour
{

    public float vel = 350f;
    public Rigidbody2D obj;
    public bool CanJumpAgain = false;

    void Start()
    {

    }

    void Update()
    {
        if (CanJumpAgain && Input.GetKeyDown(KeyCode.Space))
        {
            if (Input.GetKeyDown(KeyCode.Space))
            {
                obj.AddForce(new Vector2(0, vel * Time.deltaTime), ForceMode2D.Impulse);

            }
        }
    }

    void OnCollisionEnter2D(Collision2D anotherObj)
    {
        if (anotherObj.gameObject.CompareTag("ground"))
        {
            CanJumpAgain = true;
        }

    }

    void OnCollisionExit2D(Collision2D anotherObj)
    {
        CanJumpAgain = false;
    }
}
