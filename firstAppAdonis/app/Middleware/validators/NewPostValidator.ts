import { HttpContextContract } from "@ioc:Adonis/Core/HttpContext";
import { celebrate, Segments, Joi, errors } from "celebrate";

export default class NewPostValidator {
  public async handle(ctx: HttpContextContract, next: () => Promise<void>) {
    celebrate({
      [Segments.BODY]: Joi.object().keys({
        title: Joi.string().required(),
        content: Joi.string().required(),
      }),
    });
    await next();
  }
}
