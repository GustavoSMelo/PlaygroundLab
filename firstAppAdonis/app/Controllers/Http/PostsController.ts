import { HttpContextContract } from "@ioc:Adonis/Core/HttpContext";
import Posts from "App/Models/Posts";

export default class PostsController {
  public async store({ request }: HttpContextContract) {
    const data = request.only(["title", "content"]);

    const post = new Posts();

    post.title = data.title;
    post.content = data.content;

    await post.save();

    console.log(data);
    return post;
  }

  public async index({ response }: HttpContextContract) {
    const allPosts = await Posts.all();

    return response.json(allPosts);
  }

  public async update({ request, response }: HttpContextContract) {
    const id = request.header("id");
    const datas = request.only(["title", "content"]);

    const post = await Posts.findOrFail(id);

    if (
      datas.title !== undefined ||
      datas.title !== null ||
      datas.title !== ""
    ) {
      post.title = datas.title;
    }

    if (
      datas.content !== undefined ||
      datas.content !== null ||
      datas.content !== ""
    ) {
      post.content = datas.content;
    }

    await post.save();

    return response.json({ message: "user updated with success! " });
  }

  public async destroy({ request, response }: HttpContextContract) {
    const id = request.header("id");

    const post = await Posts.findOrFail(id);
    await post.delete();

    return response.status(200).json({ message: "post deleted with success " });
  }
}
