<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class salesModel extends Model
{

    protected $table = 'sales';

    protected $fillable = [
        'id_user',
        'id_product',
        'payment_form'
    ];

    public function product () {
        return $this->hasMany(productModel::class, 'id', 'id_product');
    }

    public function user () {
        return $this->hasMany(UserModel::class, 'id', 'id_user');
    }

    use HasFactory;
}
