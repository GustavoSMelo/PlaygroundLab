<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\Pivot;

class userCoursesModel extends Model
{

    protected $table = 'user_courses';

    protected $fillable = [
        'user_id',
        'courses_id'
    ];

    use HasFactory;
}
