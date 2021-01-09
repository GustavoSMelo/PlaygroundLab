<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class TestSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('test')->insert([
            'name' => Str::random(),
            'category' => Str::random(),
            'serial' => random_int(0, 654980),
            'engine' => Str::random()
        ]);
    }
}
