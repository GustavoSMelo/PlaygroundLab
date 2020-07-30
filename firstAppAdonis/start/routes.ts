/*
|--------------------------------------------------------------------------
| Routes
|--------------------------------------------------------------------------
|
| This file is dedicated for defining HTTP routes. A single file is enough
| for majority of projects, however you can define routes in different
| files and just make sure to import them inside this file. For example
|
| Define routes in following two files
| ├── start/routes/cart.ts
| ├── start/routes/customer.ts
|
| and then import them inside `start/routes/index.ts` as follows
|
| import './cart'
| import './customer'
|
*/

import Route from "@ioc:Adonis/Core/Route";
import PostsController from "App/Controllers/Http/PostsController";

Route.get("/", async () => {
  return { hello: "world" };
});

Route.post("/post", new PostsController().store).middleware("newPost");
Route.get("/post", new PostsController().index);
Route.put("/post", new PostsController().update).middleware("newPost");
Route.delete("/post", new PostsController().destroy);
