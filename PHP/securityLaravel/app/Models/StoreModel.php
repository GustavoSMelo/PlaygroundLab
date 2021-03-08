<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Notifications\Notifiable;
use Laravel\Sanctum\HasApiTokens;

class StoreModel extends Model
{

    protected $table = 'store';

    protected $fillable = [
        'serial',
        'password'
    ];

    use HasApiTokens, HasFactory, Notifiable;
}