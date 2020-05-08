using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SkyBox1 : MonoBehaviour {

	public float vel = 0.075f;
	public Renderer skybox;

	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		Vector2 offset = new Vector2 (vel * Time.deltaTime,0);
		skybox.material.mainTextureOffset = skybox.material.mainTextureOffset + offset;
	}
}
