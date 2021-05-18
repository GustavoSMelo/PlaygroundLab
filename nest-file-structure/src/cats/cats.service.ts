import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { getRepository, Repository } from 'typeorm';
import { cats } from './cats.model';
import { CatInterface } from './interface/cats.interface';

@Injectable()
export class CatsService {
    public async create(cat: cats): Promise<any> {
        console.log(cat);
        const catsRepository = getRepository(cats);
        await catsRepository.save(cat);
    }

    public async show(): Promise<cats[]> {
        const catRepository = getRepository(cats);
        return await catRepository.find();
    }
}
