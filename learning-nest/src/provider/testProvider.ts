import { Injectable } from '@nestjs/common';
import { catsDTO } from 'src/dto/cats.dto';

@Injectable()
export class TestProvider {
    private cats: catsDTO[] = [];

    insert(cat: catsDTO) {
        this.cats.push(cat);
    }

    show(): catsDTO[] {
        return this.cats;
    }
}
