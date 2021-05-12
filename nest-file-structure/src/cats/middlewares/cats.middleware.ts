import { Injectable, NestMiddleware } from '@nestjs/common';
import { NextFunction, Request, Response } from 'express';

@Injectable()
export class CatsMiddleware implements NestMiddleware {
    use(request: Request, response: Response, next: NextFunction) {
        console.log('request 2 ...');
        next();
    }
}
