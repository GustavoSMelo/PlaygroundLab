<?php

namespace Tests\Feature;

use Illuminate\Foundation\Testing\RefreshDatabase;
use Illuminate\Foundation\Testing\WithFaker;
use Illuminate\Support\Facades\Artisan;
use Tests\TestCase;

class FirstFeatureTest extends TestCase
{

    public function test_register_user () {

        Artisan::call('migrate:fresh');

        $name = 'gustavo';
        $email = 'gustavo';
        $password = 'gustavo';

        $response = $this->post('/api/user', [
            'name' => $name,
            'email' => $email,
            'password' => $password
        ]);

        $response
            ->assertStatus(200)
            ->assertJson(['message' => true]);
    }
}
