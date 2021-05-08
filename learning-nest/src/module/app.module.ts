import { Module } from '@nestjs/common';
import { AppController } from '../controllers/app.controller';
import { AppService } from '../app.service';
import { TestController } from '../controllers/test.controller';
import { CatsController } from 'src/controllers/cats.controller';
import { TestProvider } from 'src/provider/testProvider';

@Module({
  imports: [],
  controllers: [AppController, TestController, CatsController],
  providers: [AppService, TestProvider],
})
export class AppModule {}
