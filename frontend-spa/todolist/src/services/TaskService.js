import React from "react";
import axios from "axios";

export default class ItemService {
  baseUrl = "http://localhost:8080";

  async getAll() {
    const response = await fetch(this.baseUrl + "/tasks");
    const json = await response.json();
    return json;
  }
}
