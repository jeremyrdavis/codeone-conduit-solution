package io.vertx.models;

import io.vertx.core.json.JsonObject;

public class User {

  String username;

  String email;

  String password;

  String token;

  String bio;

  String image;

  public JsonObject toConduitJson(){

    JsonObject retVal = new JsonObject();
    JsonObject user = new JsonObject()
      .put("username", this.username)
      .put("email", this.email)
      .put("token", this.token)
      .put("bio", this.bio)
      .put("image", this.image);
    retVal.put("user", user);
    return retVal;

  }

  public User(String username, String email, String password, String token, String bio, String image) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.token = token;
    this.bio = bio;
    this.image = image;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
