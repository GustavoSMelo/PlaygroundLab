import { Body, Controller, Get, Post, Req, Res } from '@nestjs/common';
import { Request, Response } from 'express';
import { TestDTO } from '../dto/test.dto';

@Controller('/user')
export class TestController {
    @Get('/tst')
    public showMessage(): string {
        return 'This is a test';
    }

    @Post('/tst')
    public testingPost(@Req() request: Request, @Res() response: Response) {
        return response.json(request.body);
    }

    @Get('/:id')
    public testingParam(@Req() request: Request, @Res() response: Response) {
        return response.json({
            message: `The id of your user is ${request.params.id}`,
        });
    }

    @Post('/dto')
    public testingDTO(@Body() data: TestDTO, @Res() response: Response) {
        return response.json({
            data: {
                email: data.email,
                name: data.name,
            },
        });
    }
}
