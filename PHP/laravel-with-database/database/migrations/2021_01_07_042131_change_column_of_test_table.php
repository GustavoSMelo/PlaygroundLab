<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class ChangeColumnOfTestTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::table('test', function (Blueprint $table) {
            $table->bigInteger('serial')->change();
            $table->unique('serial');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::table('test', function (Blueprint $table){
            $table->dropUnique('serial');
            $table->integer('serial')->change();
        });
    }
}
