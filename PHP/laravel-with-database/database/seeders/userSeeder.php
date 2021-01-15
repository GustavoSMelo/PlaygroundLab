<?php

namespace Database\Seeders;

use App\Models\UserModel;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class userSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        UserModel::create([
            'name' => Str::random(),
            'email' => Str::random(),
            'password' => Str::random(10)
        ]);
    }
}
