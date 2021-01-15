<?php

namespace Database\Seeders;

use App\Models\productModel;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class productSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        productModel::create([
            'name' => Str::random(),
            'price' => random_int(1, 99999),
            'amount' => random_int(1, 9999),
            'type' => Str::random()
        ]);
    }
}
