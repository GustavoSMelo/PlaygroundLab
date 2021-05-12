import { CatInterface } from './interface/cats.interface';

export class CatsService {
    private CatsList: CatInterface[] = [];

    public create(cats: CatInterface): void {
        this.CatsList.push(cats);
    }

    public show(): CatInterface[] {
        return this.CatsList;
    }
}
