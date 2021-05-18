import {
    Controller,
    Get,
    HttpException,
    HttpStatus,
    Post,
    Req,
    Res,
} from '@nestjs/common';
import { Request, Response } from 'express';
import { Repository } from 'typeorm';
import { cats } from './cats.model';
import { CatsService } from './cats.service';

@Controller()
export class CatsController {
    private cats = new CatsService();

    @Post('/cats')
    public async Store(@Req() request: Request, @Res() response: Response) {
        if (
            request.body.name === null ||
            request.body.name === '' ||
            request.body.name === undefined
        ) {
            throw new HttpException(
                'Name dont send, please, insert name',
                HttpStatus.BAD_REQUEST,
            );
        } else if (
            request.body.race === null ||
            request.body.race === '' ||
            request.body.race === undefined
        ) {
            throw new HttpException(
                'Race dont send, please, insert name',
                HttpStatus.BAD_REQUEST,
            );
        } else if (
            request.body.age === null ||
            request.body.age < 0 ||
            request.body.age === undefined
        ) {
            throw new HttpException(
                'Age dont send, please, insert name',
                HttpStatus.BAD_REQUEST,
            );
        }

        await this.cats.create(request.body);

        return response.json({
            message: 'cat created with success ',
        });
    }

    @Get('/cats')
    public async Show() {
        return await this.cats.show();
    }
}
