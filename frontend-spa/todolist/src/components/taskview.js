import React, {useState, useEffect} from "react";
import { Task } from "./task";
import  ItemService  from '../services/TaskService';

export const Taskview  = ({tasks}) => {

    const taskList = tasks.map((m) => <Task todo={m} key="{todo}"/>);
  
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid text-center">
          <span className="navbar-brand mb-0 h1">SPA</span>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav ms-auto ">
              <li className="nav-item ">
                <a className="nav-link hover" aria-current="page" href="/">
                  Log out
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <header>
        <h1 className="text-white text-center">Task List</h1>

        <form id="new-task-form">
          <input
            id="new-task-input"
            className="form-control"
            placeholder="New task item"
          />

          <input id="new-task-submit" type="submit" value="Add task" />
          <input type="hidden" name="id"/>
        </form>
      </header>

      <main>
        <section className="task-list">
          <h2 className="text-center">Tasks</h2>
            {taskList}
        </section>
      </main>

    </div>
  );
};
