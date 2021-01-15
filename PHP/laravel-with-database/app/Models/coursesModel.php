<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class coursesModel extends Model
{

    protected $table = 'courses';

    protected $fillable = ['name'];

    public function user () {
        return $this->belongsToMany(UserModel::class, 'user_courses', 'courses_id', 'user_id');
    }

    use HasFactory;
}
