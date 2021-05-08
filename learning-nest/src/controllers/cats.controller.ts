import { Controller, Get, Post, Req, Res } from '@nestjs/common';
import { Request, Response } from 'express';
import { TestProvider } from 'src/provider/testProvider';

@Controller('/cats')
export class CatsController {
    constructor(private catsProvider: TestProvider){}

    @Post('/')
    public store(@Req() request: Request, @Res() response: Response) {
        try {
            this.catsProvider.insert(request.body);

            return response.json({
                message: 'success ',
            });
        } catch (err) {
            return response.status(400).json({
                error:
                    'some fields is in blank, complete all the fields and try again',
            });
        }
    }

    @Get('/')
    public index(@Res() response: Response) {
        const cats = this.catsProvider.show();

        return response.json(cats);
    }
}
