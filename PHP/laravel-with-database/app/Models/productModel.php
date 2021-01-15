<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class productModel extends Model
{

    protected $table = 'product';

    protected $fillable = [
        'name',
        'price',
        'amount',
        'type'
    ];

    public function sales () {
        return $this->belongsTo(salesModel::class, 'id_user');
    }

    use HasFactory;
}
