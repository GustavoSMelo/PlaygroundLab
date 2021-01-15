<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class UserModel extends Model
{
    protected $table = 'user';

    protected $fillable = [
        'name',
        'email',
        'password',
        'remember_token'
    ];

    public function sales () {
        return $this->belongsTo(salesModel::class, 'id_product');
    }

    public function course () {
        return $this->belongsToMany(coursesModel::class, 'user_courses', 'user_id', 'courses_id');
    }

    use HasFactory;
}
