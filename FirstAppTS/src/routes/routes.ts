import { Router } from 'https://deno.land/x/denotrain@v0.4.4/mod.ts';

const route = new Router();

route.get('/teste', (ctx: any) => {
    return { msg: 'Hello World' };
});

route.get('/', (ctx: any) => {
    return { msg: 'Main Page' };
});

route.post('/teste', async (ctx: any) => {
    const attr = ctx.req.body;
    return attr.msg;
});

export default route;
