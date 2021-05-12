import { Controller, Get, Post, Req, Res } from '@nestjs/common';
import { Request, Response } from 'express';
import { CatsService } from './cats.service';

@Controller()
export class CatsController {
    private catsService = new CatsService();

    @Post('/cats')
    public Store(@Req() request: Request, @Res() response: Response) {
        this.catsService.create(request.body);

        return response.json({
            message: 'cat created with success ',
        });
    }

    @Get('/cats')
    public Show() {
        return this.catsService.show();
    }
}
