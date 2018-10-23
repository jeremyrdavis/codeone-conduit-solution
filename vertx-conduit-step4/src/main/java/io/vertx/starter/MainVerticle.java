package io.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Future<Void> startFuture) {

    vertx.deployVerticle(HttpVerticle.class.getName());
    startFuture.complete();
  }

}
