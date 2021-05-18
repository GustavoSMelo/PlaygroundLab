import { MiddlewareConsumer, Module, NestModule } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { CatsController } from './cats.controller';
import { cats } from './cats.model';
import { CatsService } from './cats.service';
import { CatsMiddleware } from './middlewares/cats.middleware';

@Module({
    imports: [TypeOrmModule.forFeature([cats])],
    controllers: [CatsController],
    providers: [CatsService],
})
export class CatsModule implements NestModule {
    configure(middleware: MiddlewareConsumer) {
        middleware.apply(CatsMiddleware).forRoutes('/cats');
    }
}
