<?php

namespace Tests\Feature;

use Illuminate\Foundation\Testing\RefreshDatabase;
use Illuminate\Foundation\Testing\WithFaker;
use Illuminate\Support\Facades\Artisan;
use Illuminate\Support\Str;
use Tests\TestCase;

class FirstFeatureTest extends TestCase
{

    public function test_register_user () {

        Artisan::call('migrate:fresh');

        $name = Str::random(10);
        $email = Str::random(10).'@email.com';
        $password = Str::random(10);

        $response = $this->withHeader('Content-Type', 'application/json')
        ->json('POST','/api/user', [
            'name' => $name,
            'email' => $email,
            'password' => $password
        ]);

        $response
            ->assertStatus(200)
            ->assertJson(['message' => true]);
    }

    /**
    *   @depends test_register_user
    */
    public function test_get_all_users () {
        $response = $this->getJson('/api/user');

        $this->assertIsObject($response);
        $this->assertNotEmpty($response);

        $response->assertStatus(200);
    }
}
