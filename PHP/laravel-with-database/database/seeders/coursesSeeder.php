<?php

namespace Database\Seeders;

use App\Models\coursesModel;
use Illuminate\Database\Seeder;
use Illuminate\Support\Str;

class coursesSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        coursesModel::create([
            'name' => Str::random()
        ]);
    }
}
