using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SkyBox2 : MonoBehaviour {

	public float vel = 0.175f;
	public Renderer skybox;

	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		Vector2 offset = new Vector2(vel * Time.deltaTime, 0);
		skybox.material.mainTextureOffset += offset;
	}
}
