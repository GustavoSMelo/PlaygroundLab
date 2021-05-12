import { MiddlewareConsumer, Module, NestModule } from '@nestjs/common';
import { CatsController } from './cats.controller';
import { CatsService } from './cats.service';
import { CatsMiddleware } from './middlewares/cats.middleware';

@Module({
    controllers: [CatsController],
    providers: [CatsService],
})
export class CatsModule implements NestModule {
    configure(middleware: MiddlewareConsumer) {
        middleware.apply(CatsMiddleware).forRoutes('/cats');
    }
}
