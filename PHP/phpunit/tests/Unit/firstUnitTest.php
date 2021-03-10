<?php

namespace Tests\Unit;

use App\Http\Controllers\ConverterController;
use PHPUnit\Framework\TestCase;

class firstUnitTest extends TestCase
{
    /**
     * A basic unit test example.
     *
     * @return void
     */
    public function test_example()
    {

        $response = ConverterController::convertNumberToString(10);

        $this->assertIsString($response);
    }

    public function test_sum () {

        $n1 = 10;
        $n2 = 2;

        $response = ConverterController::sum($n1, $n2);

        $this->assertEquals($n1 + $n2, $response);

    }
}
