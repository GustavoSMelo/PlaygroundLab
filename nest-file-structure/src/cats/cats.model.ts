import { Column, Entity, PrimaryGeneratedColumn } from 'typeorm';

@Entity()
export class cats {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    name: string;

    @Column()
    race: string;

    @Column()
    age: number;
}
