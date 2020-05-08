using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SkyBox3 : MonoBehaviour {

	public float vel = 0.25f;
	public Renderer skybox;

	void Start () {
		
	}
	
	void Update () {
		Vector2 offset = new Vector2(vel * Time.deltaTime, 0);
		skybox.material.mainTextureOffset += offset;
	}
}
