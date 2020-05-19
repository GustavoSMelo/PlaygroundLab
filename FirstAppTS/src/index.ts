import { Application } from 'https://deno.land/x/denotrain@v0.4.4/mod.ts';
import Route from './routes/routes.ts';

const app = new Application({ hostname: 'localhost', port: 3333 });

app.use('', Route);

await app.run();
